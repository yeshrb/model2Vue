package starter;

import java.util.HashMap;

public class TypeToTag {
    static HashMap<String, String> typeToTag = new HashMap<>();
    static {
        typeToTag.put("date", "dataTime");
        typeToTag.put("number", "input");
        typeToTag.put("array", "popupPicker");
        typeToTag.put("string[]", "popupPicker");
        typeToTag.put("string", "input");
    }

    public static String getTag(String dataType) {
        if((dataType.indexOf('[')>0) &&(dataType.indexOf('[')>0))
            return "select";
        return typeToTag.get(dataType) != null ? TypeToTag.typeToTag.get(dataType) : "input";
    }


}
