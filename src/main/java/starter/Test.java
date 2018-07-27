package starter;

import antlr4.gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;


public class Test {
    public static void main(String[] args) throws Exception {
        //新建一个CharStream,从标准输入读取数据
        String filePath = Class.forName("starter.Test").getClassLoader().getResource("test.ml").getPath();

        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);

        //新建一个词法分析器，处理输入的CharStream
        ModelDefineLexer lexer = new ModelDefineLexer(input);

        //新建一个词法符号的缓冲区，用于存储词法分析器将生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //新建一个语法分析器，处理词法符号缓冲区中的内容
        ModelDefineParser parser = new ModelDefineParser(tokens);

        ParseTree tree = parser.modelDeclaration();

        ParseTreeWalker walker = new ParseTreeWalker();

        ModelParser model = new ModelParser();
        walker.walk(model,tree);

        System.out.println(model.getRawControllers());

    }
}
