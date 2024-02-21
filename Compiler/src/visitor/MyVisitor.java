package visitor;

import simpleGrammar.simpleGrammarBaseVisitor;
import simpleGrammar.simpleGrammarParser;

import java.util.Objects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyVisitor extends simpleGrammarBaseVisitor<Object> {

    public static void write2out(String newLine) {
        // Путь к файлу
        String filePath = "C:\\Users\\Ernest\\Desktop\\Compiler-Construction\\Compiler\\src\\main\\out.j";

        try {
            // Создаем объект FileWriter для записи в файл
            FileWriter fileWriter = new FileWriter(filePath, true); // true - для добавления к существующему содержимому

            // Создаем объект BufferedWriter для улучшения производительности записи
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Записываем строку в файл
            bufferedWriter.write(newLine);
            bufferedWriter.newLine(); // Добавляем новую строку

            // Закрываем BufferedWriter
            bufferedWriter.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Integer variable_counter = -1;




    @Override public Object visitCompilationUnit(simpleGrammarParser.CompilationUnitContext ctx) {
        write2out(".class public SumCalculator\n" +
                ".super java/lang/Object");

        return visitChildren(ctx);
    }

    @Override public Object visitRoutine(simpleGrammarParser.RoutineContext ctx) {
        //System.out.println(ctx.children+"kk");
        return visitChildren(ctx);
    }

    @Override public Object visitBlock(simpleGrammarParser.BlockContext ctx) {
        //System.out.println("Блок visitBlock");
        return visitChildren(ctx);
    }

    @Override public Object visitMainProg(simpleGrammarParser.MainProgContext ctx) {
        write2out(".method public static main([Ljava/lang/String;)V\n" +
                "    .limit stack 10\n" +
                "    .limit locals 4 ; Увеличим количество локальных переменных, добавив место для новой переменной\n" +
                "\n" +
                "    ; Загружаем статическое поле System.out\n" +
                "    getstatic java/lang/System/out Ljava/io/PrintStream;");

        return visitChildren(ctx);
    }

    @Override public Object visitStatement(simpleGrammarParser.StatementContext ctx) {


        if(ctx.children.get(0).getChild(0).toString().equals("var")){

            Integer level_of_expression = ctx.children.get(0).getChild(5).getChildCount();

            if(level_of_expression == 1){
                //System.out.println(ctx.children.get(0).getChild(0)); //var
                //System.out.println(ctx.children.get(0).getChild(1)); // name of var
                //System.out.println(ctx.children.get(0).getChild(2)); // :
                //System.out.println(ctx.children.get(0).getChild(3)); // type?
                //System.out.println(ctx.children.get(0).getChild(4)); // is

                write2out("    ldc "+ctx.children.get(0).getChild(5).getChild(0));
            }
            else{
                String operation_sign = ctx.children.get(0).getChild(5).getChild(1).getChild(0).toString();


                if(Objects.equals(operation_sign, "+")){
                    write2out("    iadd");
                    write2out("    istore_3");

                    //System.out.println(ctx.children.get(0).getChild(5).getChild(0)); // a
                    //System.out.println(ctx.children.get(0).getChild(5).getChild(1).getChild(0)); //+
                    //System.out.println(ctx.children.get(0).getChild(5).getChild(2).getChild(0)); //b
                }

                //write2out("    iload_3");

                if(Objects.equals(operation_sign, "-")){
                    write2out("    isub");
                    write2out("    istore_3");

                    //System.out.println(ctx.children.get(0).getChild(5).getChild(0)); // a
                    //System.out.println(ctx.children.get(0).getChild(5).getChild(1).getChild(0)); //+
                    //System.out.println(ctx.children.get(0).getChild(5).getChild(2).getChild(0)); //b
                }

                write2out("    iload_3");




            }




        }

        if(ctx.children.get(0).getChild(0).toString().equals("print(")){
            //System.out.println(ctx.children.get(0).getChild(0)); //print(

            write2out("    invokestatic java/lang/String/valueOf(I)Ljava/lang/String;");

            //Вызываем метод println для вывода строки в консоль

            write2out("    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

        }


        return visitChildren(ctx);
    }

    @Override public Object visitVariableDeclaration(simpleGrammarParser.VariableDeclarationContext ctx) {
        //System.out.println("Блок visitVariableDeclaration");


        return visitChildren(ctx);
    }

    @Override public Object visitExpressionStatement(simpleGrammarParser.ExpressionStatementContext ctx) {
        //System.out.println("Блок visitExpressionStatement");
        return visitChildren(ctx);
    }

    @Override public Object visitExpression(simpleGrammarParser.ExpressionContext ctx) {
        //System.out.println("Блок visitExpression");
        return visitChildren(ctx);
    }

    @Override public Object visitOperation(simpleGrammarParser.OperationContext ctx) {
        //System.out.print("Блок visitOperation, Операция:");
        return visitChildren(ctx);
    }

    @Override public Object visitType(simpleGrammarParser.TypeContext ctx) {
        //System.out.println("Блок visitType");
        return visitChildren(ctx);
    }
    @Override public Object visitEnd(simpleGrammarParser.EndContext ctx) {
        write2out("    return\n" +
                ".end method");

        return visitChildren(ctx);
    }



}