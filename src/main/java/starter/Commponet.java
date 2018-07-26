package starter;

import Helper.STHelper;
import org.stringtemplate.v4.ST;

import java.util.HashMap;

public class Commponet {
    ST stringTemp;
    String type;
    String title;
    String model;
    String data;
    String placeHolder;
    String validator;
    String requied;
    HashMap<String, String> fields = new HashMap<String, String>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public String getRequied() {
        return this.requied;
    }

    public void setRequied(String requied) {
        this.requied = requied;
    }

    public HashMap<String, String> getFields() {
        return fields;
    }

    public void setFields(HashMap<String, String> fields) {
        this.fields = fields;
    }


    public void getTempateInstance(String type) {
        STHelper.getST(type);
    }

    public ST getStringTemp() {
        if (this.stringTemp == null)
            stringTemp = STHelper.getST(type);
        return stringTemp;
    }

    public void setComponetAttribute(String name, String value) {
        stringTemp.add(name,value);
    }
}
