// Generated from D:/school/jaar 3/ASD Project/CompilerTest/InterpreterTest/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.listner;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#conditionalLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalLoopStatement(MyGrammarParser.ConditionalLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MyGrammarParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#meerdereLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#enkelLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(MyGrammarParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MyGrammarParser.OperatorContext ctx);
}