// Generated from ModelDefine.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelDefineParser}.
 */
public interface ModelDefineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelDeclaration(ModelDefineParser.ModelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void enterModelBody(ModelDefineParser.ModelBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#modelBody}.
	 * @param ctx the parse tree
	 */
	void exitModelBody(ModelDefineParser.ModelBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#modelBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelBodyDeclaration(ModelDefineParser.ModelBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#modelBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelBodyDeclaration(ModelDefineParser.ModelBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ModelDefineParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(ModelDefineParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(ModelDefineParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#modelType}.
	 * @param ctx the parse tree
	 */
	void enterModelType(ModelDefineParser.ModelTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#modelType}.
	 * @param ctx the parse tree
	 */
	void exitModelType(ModelDefineParser.ModelTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ModelDefineParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ModelDefineParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#fieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaratorId(ModelDefineParser.FieldDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#fieldDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaratorId(ModelDefineParser.FieldDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#constraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(ModelDefineParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#constraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(ModelDefineParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#constraintBody}.
	 * @param ctx the parse tree
	 */
	void enterConstraintBody(ModelDefineParser.ConstraintBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#constraintBody}.
	 * @param ctx the parse tree
	 */
	void exitConstraintBody(ModelDefineParser.ConstraintBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#constraintBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstraintBodyDeclaration(ModelDefineParser.ConstraintBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#constraintBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstraintBodyDeclaration(ModelDefineParser.ConstraintBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#constraintDeclare}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclare(ModelDefineParser.ConstraintDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#constraintDeclare}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclare(ModelDefineParser.ConstraintDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#validatorDeclare}.
	 * @param ctx the parse tree
	 */
	void enterValidatorDeclare(ModelDefineParser.ValidatorDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#validatorDeclare}.
	 * @param ctx the parse tree
	 */
	void exitValidatorDeclare(ModelDefineParser.ValidatorDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelDefineParser#validatorMethods}.
	 * @param ctx the parse tree
	 */
	void enterValidatorMethods(ModelDefineParser.ValidatorMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelDefineParser#validatorMethods}.
	 * @param ctx the parse tree
	 */
	void exitValidatorMethods(ModelDefineParser.ValidatorMethodsContext ctx);
}