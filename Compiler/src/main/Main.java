package main;

import simpleGrammar.simpleGrammarLexer;
import simpleGrammar.simpleGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.MyVisitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

