package starter;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;

public class FileHelper {
    public static void writeToFile(Document document, String filePath) {
        try {
            OutputFormat format = new OutputFormat();
            format.setSuppressDeclaration(true);
            XMLWriter writer = new XMLWriter(new FileWriter(new File(filePath)),format);
            writer.write(document);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
