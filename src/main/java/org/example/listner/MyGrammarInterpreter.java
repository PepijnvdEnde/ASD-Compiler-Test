package org.example.listner;


public class MyGrammarInterpreter extends MyGrammarBaseVisitor<Void> {
    private StringBuilder javaCode = new StringBuilder();

    @Override
    public Void visitMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx) {
        int times = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        javaCode.append("for (int i = 0; i < ").append(times).append("; i++) {\n");
        javaCode.append("    System.out.println(\"Loopen naar ").append(direction).append("\");\n");
        javaCode.append("}\n");

        return null;
    }

    @Override
    public Void visitEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx) {
        String direction = ctx.direction().getText();

        javaCode.append("System.out.println(\"Looping ").append(direction).append("\");\n");

        return null;
    }

    public String getJavaCode() {
        return javaCode.toString();
    }
}