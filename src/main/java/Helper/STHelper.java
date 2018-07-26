package Helper;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import starter.Commponet;
import starter.Controller;

import java.util.HashMap;
import java.util.Map;

public class STHelper {

    private static String fileName
            = STHelper.class.getClassLoader().getResource("add_vue.stg").getPath();
    ;
    private static STGroup stGroup
            = new STGroupFile(fileName, '$', '$');
    ;

    public static String createVueString(HashMap<String, Commponet> controllers) {
        ST pageTempate = stGroup.getInstanceOf("pageTempate");
        for (Map.Entry<String, Commponet> controller : controllers.entrySet()) {
            String str = createControllerRenderString(controller.getValue());
            pageTempate.add("commponnets", str);
        }
        return pageTempate.render();
    }

    private static String createControllerRenderString(Commponet controller) {
        ST st = getSTByControllerType(controller.getType());
        st.add("title", controller.getTitle());
        st.add("model", controller.getTitle());
        st.add("data", controller.getTitle());
        st.add("required", controller.getRequied());
        st.add("showName", controller.getTitle());
        return st.render();
    }

    private static ST getSTByControllerType(String type) {
        String name = Controller.getTemplate(type);
        String defaultControllerName = "input";
        ST st = stGroup.getInstanceOf(name);
        return  (st!=null)? st:stGroup.getInstanceOf(defaultControllerName);
    }


    public static ST getST(String type) {
        return getSTByControllerType(type);
    }
}
