package visitor;

import simpleGrammar.simpleGrammarBaseVisitor;
import simpleGrammar.simpleGrammarParser;

public class MyVisitor extends simpleGrammarBaseVisitor<Object> {

    @Override public Object visitCompilationUnit(simpleGrammarParser.CompilationUnitContext ctx) {
        System.out.println("Блок visitCompilationUnit");
        return visitChildren(ctx);
    }

    @Override public Object visitRoutine(simpleGrammarParser.RoutineContext ctx) {
        System.out.println("Блок visitRoutine");
        return visitChildren(ctx);
    }

    @Override public Object visitBlock(simpleGrammarParser.BlockContext ctx) {
        System.out.println("Блок visitBlock");
        return visitChildren(ctx);
    }

    @Override public Object visitMainProg(simpleGrammarParser.MainProgContext ctx) {
        System.out.println("Блок visitMainProg");
        return visitChildren(ctx);
    }

    @Override public Object visitStatement(simpleGrammarParser.StatementContext ctx) {
        System.out.println("Блок visitStatement");
        return visitChildren(ctx);
    }

    @Override public Object visitVariableDeclaration(simpleGrammarParser.VariableDeclarationContext ctx) {
        System.out.println("Блок visitVariableDeclaration");
        return visitChildren(ctx);
    }

    @Override public Object visitExpressionStatement(simpleGrammarParser.ExpressionStatementContext ctx) {
        System.out.println("Блок visitExpressionStatement");
        return visitChildren(ctx);
    }

    @Override public Object visitExpression(simpleGrammarParser.ExpressionContext ctx) {
        System.out.println("Блок visitExpression");
        return visitChildren(ctx);
    }

    @Override public Object visitOperation(simpleGrammarParser.OperationContext ctx) {
        System.out.println("Блок visitOperation");
        return visitChildren(ctx);
    }

    @Override public Object visitType(simpleGrammarParser.TypeContext ctx) {
        System.out.println("Блок visitType");
        return visitChildren(ctx);
    }

}