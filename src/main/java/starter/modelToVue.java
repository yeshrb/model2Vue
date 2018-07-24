package starter;


import antlr4.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;


/**
 * Created by ljj on 2018/2/1.
 */
public class modelToVue implements ModelDefineListener {

    static final String templateBegin = "<template> \n"+ "\t<div>\n";
    static final String templateEnd = "\t</div>\n"+ "</template> ";
    StringBuffer buffer = new StringBuffer(templateBegin);
    String componetTempate=null;

    @Override
    public void enterModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {


    }

    @Override
    public void exitModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {
        buffer.append(templateEnd);
        System.out.println(buffer);
        File file = new File("../test.vue");
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
           if (!file.exists())
               file.createNewFile();
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(pw!=null) pw.close();
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void enterModelBody(ModelDefineParser.ModelBodyContext ctx) {

    }

    @Override
    public void exitModelBody(ModelDefineParser.ModelBodyContext ctx) {

    }

    @Override
    public void enterModelBodyDeclaration(ModelDefineParser.ModelBodyDeclarationContext ctx) {

    }

    @Override
    public void exitModelBodyDeclaration(ModelDefineParser.ModelBodyDeclarationContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterTypeType(ModelDefineParser.TypeTypeContext ctx) {

    }

    @Override
    public void exitTypeType(ModelDefineParser.TypeTypeContext ctx) {
        buffer.append("\t\t");
        String type = ctx.getText();
        componetTempate = Controller.getTemplate(type);
        buffer.append(componetTempate);

    }

    @Override
    public void enterModelType(ModelDefineParser.ModelTypeContext ctx) {

    }

    @Override
    public void exitModelType(ModelDefineParser.ModelTypeContext ctx) {


    }

    @Override
    public void enterPrimitiveType(ModelDefineParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void exitPrimitiveType(ModelDefineParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void enterFieldDeclaratorId(ModelDefineParser.FieldDeclaratorIdContext ctx) {
    }

    @Override
    public void exitFieldDeclaratorId(ModelDefineParser.FieldDeclaratorIdContext ctx) {
        buffer.append(" ");
        buffer.append(ctx.IDENTIFIER());
        buffer.append(componetTempate.replace("<","</") );
        componetTempate=null;
        buffer.append("\n");

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

