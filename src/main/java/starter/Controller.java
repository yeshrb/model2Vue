package starter;

import java.util.HashMap;


public class Controller {
    static final HashMap<String,String> TYPE_CONTEOLLER= new HashMap<String,String>();
    static {
        TYPE_CONTEOLLER.put("date","dataTime");

    }

    public static String getTemplate(String type) {
        String key = type.toLowerCase();
        if((type.indexOf("[")>-1) && (type.indexOf("]")>-1)) return "popupPicker";
        if( TYPE_CONTEOLLER.get(key)==null) return "input";
        return TYPE_CONTEOLLER.get(key);
    }
}
