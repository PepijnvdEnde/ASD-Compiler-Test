// Generated from C:/Users/woute/Documents/GitHub/ASD-Compiler-Test/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.listner;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 */
	void enterAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#agent}.
	 * @param ctx the parse tree
	 */
	void exitAgent(MyGrammarParser.AgentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(MyGrammarParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(MyGrammarParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#omgevingssituatie}.
	 * @param ctx the parse tree
	 */
	void enterOmgevingssituatie(MyGrammarParser.OmgevingssituatieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#omgevingssituatie}.
	 * @param ctx the parse tree
	 */
	void exitOmgevingssituatie(MyGrammarParser.OmgevingssituatieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#spelerssituatie}.
	 * @param ctx the parse tree
	 */
	void enterSpelerssituatie(MyGrammarParser.SpelerssituatieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#spelerssituatie}.
	 * @param ctx the parse tree
	 */
	void exitSpelerssituatie(MyGrammarParser.SpelerssituatieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 */
	void enterActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#actie}.
	 * @param ctx the parse tree
	 */
	void exitActie(MyGrammarParser.ActieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(MyGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(MyGrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MyGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MyGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MyGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MyGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 */
	void enterAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#attribuut}.
	 * @param ctx the parse tree
	 */
	void exitAttribuut(MyGrammarParser.AttribuutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#handeling}.
	 * @param ctx the parse tree
	 */
	void enterHandeling(MyGrammarParser.HandelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#handeling}.
	 * @param ctx the parse tree
	 */
	void exitHandeling(MyGrammarParser.HandelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 */
	void enterRichting(MyGrammarParser.RichtingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#richting}.
	 * @param ctx the parse tree
	 */
	void exitRichting(MyGrammarParser.RichtingContext ctx);
}