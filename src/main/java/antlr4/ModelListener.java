// Generated from Model.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#modelDeclare}.
	 * @param ctx the parse tree
	 */
	void enterModelDeclare(ModelParser.ModelDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#modelDeclare}.
	 * @param ctx the parse tree
	 */
	void exitModelDeclare(ModelParser.ModelDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ModelParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ModelParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclare(ModelParser.FieldDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclare(ModelParser.FieldDeclareContext ctx);
}