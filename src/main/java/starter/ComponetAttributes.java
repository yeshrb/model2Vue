package starter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComponetAttributes {
    private HashMap<String,String> attributes;

    public void setAttributes(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }
    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    public ComponetAttributes() {
        this.attributes = new HashMap<String,String>();
    }
    public ComponetAttributes add(String attrName,String attrValue) {
        this.attributes.put(attrName,attrValue);
        return this;
    }
    public ComponetAttributes remove(String attrName) {
        this.attributes.remove(attrName);
        return this;
    }
    public ComponetAttributes modify(String attrName,String attrValue) {
        this.attributes.put(attrName,attrValue);
        return this;
    }
    public String get(String attrName) {
        return this.attributes.get(attrName);
    }
    public Set<Map.Entry<String, String>> getAll() {
        return this.attributes.entrySet();
    }

    public Iterable<? extends Map.Entry<String, String>> entrySet() {
        return null;
    }
}
