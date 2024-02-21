package main;

import simpleGrammar.simpleGrammarLexer;
import simpleGrammar.simpleGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.MyVisitor;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        try {
            String inputFile = "Compiler/src/main/ex.txt";
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(new File( inputFile))
            );
            simpleGrammarLexer lexer = new simpleGrammarLexer(input);
            simpleGrammarParser parser = new simpleGrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.compilationUnit();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            //GenerateOutCode(tree); -> создает файл out.j

            String buildCommand = "java -jar C:\\Users\\Ernest\\Desktop\\Compiler-Construction\\Compiler\\lib\\jasmin.jar C:\\Users\\Ernest\\Desktop\\Compiler-Construction\\Compiler\\src\\main\\out.j\n";
            executeCommand(buildCommand);

            // 2. Запуск созданного файла .class с названием SumCalculator
            String runCommand = "java SumCalculator";
            executeCommand(runCommand);

        } catch (
                IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void executeCommand(String command) throws IOException, InterruptedException {
        // Создание объекта ProcessBuilder с заданной командой
        ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));

        // Запуск процесса
        Process process = processBuilder.start();

        // Чтение вывода команды
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    }

}

