package starter;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.HashMap;
import java.util.Map;

public class VueCommpontRender {
    private String stgFile;;
    private STGroup stGroup;
    private ComponetAttributes attributes;

    public VueCommpontRender() {
        this("VueComponent.stg");
        this.attributes = new ComponetAttributes();
    }

    public VueCommpontRender(String stfFile) {
        this.stgFile = stfFile;
        stGroup = new STGroupFile(stgFile, '$', '$');

    }
    public VueCommpontRender(String stfFile,ComponetAttributes attrs) {
        this.stgFile = stfFile;
        stGroup = new STGroupFile(stgFile, '$', '$');
        this.attributes = attrs;

    }

    public String vueCommpontSTCreate(String dataType) throws Exception {
        String tagName = getTagName(dataType.toLowerCase());
        return getRenderString(tagName);
    }

    private  String getRenderString(String tagName) {
        ST st = stGroup.getInstanceOf(tagName);
         Map map = st.getAttributes();
        st.getAttributes();
        for(Map.Entry<String,String> attr : attributes.getAll()) {
         String argName = attr.getKey();
         if(map.containsKey(argName))
             st.add(argName,attr.getValue());
         else
             continue;
        }
        return st.render();
    }



    private   String getTagName(String dataType) {
        return TypeToTag.getTag(dataType);
    }


}
