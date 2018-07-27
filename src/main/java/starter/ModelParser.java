package starter;

import antlr4.gen.*;

import java.util.*;


/**
 * Created by ljj on 2018/2/1.
 */
public class ModelParser extends ModelDefineBaseListener {

    private HashMap<String, Map<String, String>> rawControllers
           = new HashMap<String, Map<String, String>>();

    public HashMap<String, Map<String, String>> getRawControllers() {
        return rawControllers;
    }


    @Override
    public void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx) {
        String type = ctx.typeType().getText();
        String fieldId = ctx.fieldDeclaratorId().getText();
        //控件的解析
        rawControllers.put(fieldId, parseFieldToCommpont("type", type));
    }
    @Override
    public void exitFieldConstraintDeclare(ModelDefineParser.FieldConstraintDeclareContext ctx) {
        String fieldHaveToBeConstraint = ctx.constaintFiledId().getText();
        Map<String, String> componet = rawControllers.get(fieldHaveToBeConstraint);

        componet.put("constraints", processConstrains(ctx));
        componet.put("validator", processValidatorString(ctx));
    }

    @Override
    public void exitModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx) {
       //String outputString = STHelper.createVueString(rawControllers);

        String fileName = ctx.IDENTIFIER().getText();
        //FileHelper.writeToFile(outputString, fileName + ".vue");
    }

    private HashMap<String, String> parseFieldToCommpont(String type, String fieldId) {
        HashMap<String, String> attributePair = new HashMap<String, String>();
        attributePair.put(type, fieldId);
        return attributePair;
    }

    private String processConstrains(ModelDefineParser.FieldConstraintDeclareContext ctx) {
        List<ModelDefineParser.ConstraintDeclareContext> csCtx = ctx.constraintDeclare();
        StringBuffer sb = new StringBuffer();
        return traversalConstraintDeclare(csCtx, sb);
    }

    private String traversalConstraintDeclare(List<ModelDefineParser.ConstraintDeclareContext> csCtx, StringBuffer sb) {

        for (ModelDefineParser.ConstraintDeclareContext ct : csCtx) {
            if (ct.constraintDeclare().size() > 0)
                traversalConstraintDeclare(ct.constraintDeclare(), sb);
            else {

                sb.append(ct.CONSTRAINTKEY().getText() + ":" + ct.CONSTRAINTVALUE().getText() + ",");
            }
        }

        return sb.substring(0, sb.length() - 2);
    }
    private String processValidatorString(ModelDefineParser.FieldConstraintDeclareContext ctx) {
        ModelDefineParser.ValidatorDeclareContext vcts = ctx.validatorDeclare();
        if (vcts.validatorMethods() == null) return null;
        return vcts.validatorMethods().getText();
    }
}

