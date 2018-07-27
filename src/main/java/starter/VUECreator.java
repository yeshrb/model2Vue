package starter;

import org.stringtemplate.v4.STGroup;

import java.util.HashMap;
import java.util.Map;

public class VUECreator {
    private String pageName;
    String pageTemplateFilePath;
    private ComponetAttributes attributes;
    private HashMap<String, Map<String, String>> rawAttributes;
    private HashMap<String,ComponetAttributes> controller;

    public VUECreator(String pageName,String stgFile,HashMap<String, Map<String, String>> rawAttributes) {
        this.pageName = pageName;
        this.pageTemplateFilePath = stgFile;
        this.rawAttributes = rawAttributes;
        attributes= new ComponetAttributes();
        processAttributes();

    }

    private void processAttributes() {
        controller = new HashMap<>();
        for(Map.Entry<String,Map<String,String>> en : rawAttributes.entrySet()){
            ComponetAttributes attrs = new ComponetAttributes();
            Map<String,String> map = en.getValue();
            controller.put(map.get("type"),attrs);
            attrs.add("title",en.getKey());
            for(Map.Entry<String,String> entry : en.getValue().entrySet()){
                if(entry.getKey()=="nullable")
                    attrs.add("required","required");
                attrs.add(entry.getKey(),entry.getValue());
            }
        }
    }


    public void setPageTemplateFilePath(String pageTemplateFilePath) {
        this.pageTemplateFilePath = pageTemplateFilePath;
    }

    public String getPageName() {
        return pageName;
    }

    public ComponetAttributes getAttributes() {
        if(attributes==null)
            return new ComponetAttributes();
        return attributes;
    }


    public String buildString(String dataType) throws Exception {
       StringBuilder sb = new StringBuilder();

    }


}
