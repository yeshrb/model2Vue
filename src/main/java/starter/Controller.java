package starter;

import java.util.HashMap;

public class Controller {
    static final HashMap<String,String> TYPE_CONTEOLLER= new HashMap<String,String>();
    static {
        TYPE_CONTEOLLER.put("data","<XData>");

    }

    public static String getTemplate(String type) {
        String key = type.toLowerCase();
        if( TYPE_CONTEOLLER.get(key)==null) return "<XInput>";
        return TYPE_CONTEOLLER.get(key);

    }
}
