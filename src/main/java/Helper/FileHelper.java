package Helper;



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
