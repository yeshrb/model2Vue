package starter;

import antlr4.gen.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.dom4j.*;
import org.jaxen.JaxenException;
import org.jaxen.dom4j.Dom4jXPath;

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

        String fieldHaveToBeConstraint = ctx.constaintFiledId().getText();
        Element element = getElementByAttribute("title", fieldHaveToBeConstraint);

        if (isRequiredField(ctx)) {
            element.addAttribute("required", "true");
        }

        String validatorString = buildValidatorString(ctx);

        if (validatorString != null && validatorString.length() > 0) {
            element.addAttribute("validator", validatorString);
        }
    }


    private Element getElementByAttribute(String attrName, String attrValue) {
        String xpathExpr = "//*[@" + attrName + "='" + attrValue + "']";
        Element currentElement = null;
        try {
            Dom4jXPath xpath = new Dom4jXPath(xpathExpr);
            currentElement = (Element) xpath.selectSingleNode(document);

        } catch (JaxenException e) {
            e.printStackTrace();
        }
        return currentElement;
    }

    private boolean isRequiredField(ModelDefineParser.ConstraintFieldDeclareContext ctx) {
        return ctx.constraintDeclare() != null;
    }

    private String buildValidatorString(ModelDefineParser.ConstraintFieldDeclareContext ctx) {
        ModelDefineParser.ValidatorDeclareContext vcts = ctx.validatorDeclare();

        if (vcts.validatorMethods() == null) return null;

        List<TerminalNode> methods = vcts.validatorMethods().IDENTIFIER();
        StringBuilder validatorStr = new StringBuilder("validator:");
        for (int i = 0; i < methods.size(); i++) {
            validatorStr.append(methods.get(i) +",");
        }
        String ret = validatorStr.toString();
        return  ret.substring(0,ret.lastIndexOf(',')) ;
    }


    @Override
    public void exitConstaintFiledId(ModelDefineParser.ConstaintFiledIdContext ctx) {

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

