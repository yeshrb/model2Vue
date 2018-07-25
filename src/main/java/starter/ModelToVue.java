package starter;

import antlr4.gen.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.dom4j.*;
import org.jaxen.JaxenException;
import org.jaxen.dom4j.Dom4jXPath;

import java.util.Iterator;
import java.util.List;


/**
 * Created by ljj on 2018/2/1.
 */
public class ModelToVue extends ModelDefineBaseListener {
    Document document;
    Element contentElement;


    @Override
    public void enterModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {
        document = DocumentHelper.createDocument();
        Element root = document.addElement("template");
        contentElement = root.addElement("div");
    }

    @Override
    public void exitModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {
        String fileName = ctx.IDENTIFIER().getText();
        Element root = document.getRootElement();
        FileHelper.writeToFile(document, fileName + ".vue");
    }


    @Override
    public void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {
        String type = ctx.typeType().getText();
        String fieldId = ctx.fieldDeclaratorId().getText();
        String controllerTag = Controller.getTemplate(type);
        Element el = contentElement.addElement(controllerTag);
        el.addAttribute("title", fieldId);

    }

    @Override
    public void exitConstraintFieldDeclare(ModelDefineParser.ConstraintFieldDeclareContext ctx) {
        String attr = ctx.constaintFiledId().getText();
        String xpathExpr = "//*[@title='" + attr + "']";
        Element currentElement = null;

        try {
            Dom4jXPath xpath = new Dom4jXPath(xpathExpr);
            currentElement = (Element) xpath.selectSingleNode(document);
            currentElement.addAttribute("requied","true");
            System.out.println(currentElement);
        } catch (JaxenException e) {
            e.printStackTrace();
        }
        ModelDefineParser.ConstraintDeclareContext context = ctx.constraintDeclare(0);
        List<ModelDefineParser.ConstraintDeclareContext> subContext = context.constraintDeclare();
        for (ModelDefineParser.ConstraintDeclareContext ct : subContext) {
            System.out.println(ct.CONSTRAINTKEY().getText() + ":" + ct.CONSTRAINTVALUE().getText());
        }

        ModelDefineParser.ValidatorDeclareContext vcts = ctx.validatorDeclare();
        System.out.println(vcts.VALIDATOR().getText());
        List<TerminalNode> methods = vcts.validatorMethods().IDENTIFIER();
        for (int i = 0; i < methods.size(); i++) {
            System.out.println("m" + i + ":" + methods.get(i));
        }


//        parse(document.getRootElement(),"title",attr);
//        Element el = parse(document.getRootElement(),"title",attr);
//        el.addAttribute("requied","true");

    }

    @Override
    public void exitConstaintFiledId(ModelDefineParser.ConstaintFiledIdContext ctx) {

    }

    private boolean isExsit(String text) {
        return true;
    }

    @Override
    public void exitConstraintDeclare(ModelDefineParser.ConstraintDeclareContext ctx) {


    }

//    private Element parse(Element node, String type, String val) {
//        for (Iterator iter = node.elementIterator(); iter.hasNext(); ) {
//            Element element = (Element) iter.next();
//            //Attribute name = element.attribute(type);
//
//            System.out.println(element.getName()+ ":"+ element.attribute("title"));
////            if (name != null) {
////                String value = name.getValue();
////                if (value != null && val.equals(value))
////                    return element;
////                else
////                    parse(element, type, val);
////            }
////            else
////                continue;
//        }
//        return null;
//    }


}

