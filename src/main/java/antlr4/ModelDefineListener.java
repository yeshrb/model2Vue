
package antlr4;
// Generated from ModelDefine.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.io.IOException;

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
}