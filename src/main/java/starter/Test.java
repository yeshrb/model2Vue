package starter;

import antlrGen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("input array");
        //新建一个CharStream,从标准输入读取数据
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        //新建一个词法分析器，处理输入的CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        //新建一个词法符号的缓冲区，用于存储词法分析器将生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //新建一个语法分析器，处理词法符号缓冲区中的内容
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Short2UnicodeString(),tree);
        System.out.println();
    }
}
