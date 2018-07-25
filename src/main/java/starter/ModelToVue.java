package starter;

import antlr4.gen.*;
import org.dom4j.*;

import java.util.Iterator;


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
        FileHelper.writeToFile(document, fileName+".vue");
    }


    @Override
    public void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {
        String type = ctx.typeType().getText();
        String fieldId = ctx.fieldDeclaratorId().getText();
        String controllerTag = Controller.getTemplate(type);
        contentElement.addElement(controllerTag).addAttribute("title", fieldId);

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

    private Element parse(Element node, String type, String val) {
        for (Iterator iter = node.elementIterator(); iter.hasNext(); ) {
            Element element = (Element) iter.next();
            Attribute name = element.attribute(type);
            if (name != null) {
                String value = name.getValue();
                if (value != null && val.equals(value))
                    return element;
                else
                    parse(element, type, val);
            }
        }
        return null;
    }


}

