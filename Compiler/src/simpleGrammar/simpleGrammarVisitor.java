// Generated from C:/Users/Ernest/Desktop/Compiler-Construction/Compiler/src/simpleGrammar/simpleGrammar.g4 by ANTLR 4.13.1
package simpleGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(simpleGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine(simpleGrammarParser.RoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(simpleGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#mainProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProg(simpleGrammarParser.MainProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#printKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintKeyWord(simpleGrammarParser.PrintKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(simpleGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(simpleGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simpleGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(simpleGrammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(simpleGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(simpleGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleGrammarParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(simpleGrammarParser.EndContext ctx);
}