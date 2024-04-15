package org.example;


import org.example.listner.MyGrammarBaseVisitor;
import org.example.listner.MyGrammarParser;

public class MyGrammarInterpreter extends MyGrammarBaseVisitor<Void> {
    private StringBuilder javaCode = new StringBuilder();

    public MyGrammarInterpreter() {
        javaCode.append("public class output {\npublic static void main(String[] args) {\nint hp = 5;\nint spd = 120;\n");
    }

    @Override
    public Void visitConditionalLoopStatement(MyGrammarParser.ConditionalLoopStatementContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        String attribuut = ctx.attribuut().getText();
        String operator = ctx.operator().getText();
        if (operator.equals("kleiner dan")) {
            operator = " < ";
        } else if (operator.equals("groter dan")) {
            operator = " > ";
        }


        javaCode.append("if (").append(attribuut).append(operator).append(value ).append(") {\n");

        if (ctx.loopStatement() != null) {
            visit(ctx.loopStatement());
        }
        javaCode.append("}\n");

        return null;
    }

    @Override
    public Void visitLoopStatement(MyGrammarParser.LoopStatementContext ctx) {
        if (ctx.meerdereLoopStatement() != null) {
            visit(ctx.meerdereLoopStatement());
        } else if (ctx.enkelLoopStatement() != null) {
            visit(ctx.enkelLoopStatement());
        }

        return null;
    }

    @Override
    public Void visitMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx) {
        int times = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        javaCode.append("for (int i = 0; i < ").append(times).append("; i++) {\n");
        javaCode.append("System.out.println(\"loop naar ").append(direction).append("\");\n");
        javaCode.append("}\n");

        return null;
    }

    @Override
    public Void visitEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx) {
        String direction = ctx.direction().getText();

        javaCode.append("System.out.println(\"loop naar ").append(direction).append("\");\n");

        return null;
    }

    public String getJavaCode() {
        return javaCode.toString() + "}\n}";
    }
}

