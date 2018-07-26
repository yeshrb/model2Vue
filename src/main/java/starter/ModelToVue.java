package starter;

import antlr4.gen.*;
import Helper.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;



/**
 * Created by ljj on 2018/2/1.
 */
public class ModelToVue extends ModelDefineBaseListener {
    HashMap<String,Commponet> controllers = new HashMap<String,Commponet>();
    @Override
    public void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {
        String type = ctx.typeType().getText();
        String fieldId = ctx.fieldDeclaratorId().getText();
        Commponet commponet = ComponnetFacactory.create(type);
        commponet.setComponetAttribute("title",fieldId);
        controllers.put(fieldId,commponet);
    }



    @Override
    public void exitConstraintFieldDeclare(ModelDefineParser.ConstraintFieldDeclareContext ctx) {
        String fieldHaveToBeConstraint = ctx.constaintFiledId().getText();
        Commponet commponet = controllers.get(fieldHaveToBeConstraint);

        //遍历constraintDeclare ,取出每个constrains的key，value，然后设置componet的属性
        List<ModelDefineParser.ConstraintDeclareContext> csCtx = ctx.constraintDeclare();
        setConstraints(csCtx,commponet);

        String validatorString = buildValidatorString(ctx);

        if (validatorString != null && validatorString.length() > 0) {
            commponet.setValidator(validatorString);
        }
        ctx.getRuleContext()
    }

    private void setConstraints(List<ModelDefineParser.ConstraintDeclareContext> csCtx, Commponet commponet) {
        for(ModelDefineParser.ConstraintDeclareContext ct :csCtx){
            if(ct.constraintDeclare().size()>0)
                setConstraints(ct.constraintDeclare(),commponet);
            else {
                commponet.setComponetAttribute( ct.CONSTRAINTKEY().getText(),ct.CONSTRAINTVALUE().getText());
            }
        }
    }

    @Override
    public void exitModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {
        String outputString = STHelper.createVueString(controllers) ;
        System.out.println(outputString);
        String fileName = ctx.IDENTIFIER().getText();
        FileHelper.writeToFile(outputString, fileName + ".vue");
    }


    private String buildRequired(ModelDefineParser.ConstraintFieldDeclareContext ctx) {
        return "true";
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





}

