// Generated from C:/Users/woute/Documents/GitHub/ASD-Compiler-Test/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(MyGrammarParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#omgevingssituatie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmgevingssituatie(MyGrammarParser.OmgevingssituatieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#spelerssituatie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpelerssituatie(MyGrammarParser.SpelerssituatieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(MyGrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MyGrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MyGrammarParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#handeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandeling(MyGrammarParser.HandelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRichting(MyGrammarParser.RichtingContext ctx);
}