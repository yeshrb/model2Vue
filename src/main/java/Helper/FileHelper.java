package Helper;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;

public class FileHelper {
    public static void writeToFile(String outputStr, String filePath) {

        try {
            FileWriter writer = new FileWriter(new File(filePath));
            writer.write(outputStr);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
