// Generated from C:/Users/guzel/IdeaProjects/CompilerMyGitHub/Compiler-Construction/Compiler/src/simpleGrammar/simpleGrammar.g4 by ANTLR 4.13.1
package simpleGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleGrammarParser}.
 */
public interface simpleGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(simpleGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(simpleGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(simpleGrammarParser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(simpleGrammarParser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(simpleGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(simpleGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void enterMainProg(simpleGrammarParser.MainProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void exitMainProg(simpleGrammarParser.MainProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(simpleGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(simpleGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(simpleGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(simpleGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpleGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpleGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(simpleGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(simpleGrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(simpleGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(simpleGrammarParser.TypeContext ctx);
}