import antlr4.gen.ModelDefineLexer;
import antlr4.gen.ModelDefineParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import starter.ModelParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;



public class ModelParserTest {

   @Before
    public void setUp() {

    }

    @Test
    public void test_create_componets_hashMap() throws Exception {

        FileInputStream fis = createFileInputStream();
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
        walker.walk(model, tree);
        HashMap expected = new HashMap();

        HashMap m1 = new HashMap();
        m1.put("type", "string");
        m1.put("validator", "aMethod,bMethod");
        m1.put("constraints", "nullable:true,blank:tru");
        HashMap m2 = new HashMap();
        m2.put("type", "number");
        m2.put("validator", "aMethod,bMethod");
        m2.put("constraints", "nullable:true,blank:tru");

        HashMap m3 = new HashMap();
        m3.put("type", "Date");

        HashMap m4 = new HashMap();
        m4.put("type", "string[]");

        expected.put("name", m1);
        expected.put("age", m2);
        expected.put("birthday", m3);
        expected.put("others", m4);

        assertEquals(expected, model.getRawControllers());


        System.out.println(model.getRawControllers());
    }

    private FileInputStream createFileInputStream() throws ClassNotFoundException, FileNotFoundException {
        String filePath = Class.forName("ModelParserTest").getClassLoader().getResource("test.ml").getPath();

        File file = new File(filePath);
        return new FileInputStream(file);
    }
}
