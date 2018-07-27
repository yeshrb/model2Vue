package starter;

import java.util.HashMap;

public class VueCommpontRenderBuilder {
    private String stfFile;
    private HashMap<String, String> attrs;

    public VueCommpontRenderBuilder setStfFile(String stfFile) {
        this.stfFile = stfFile;
        return this;
    }

    public VueCommpontRenderBuilder setAttrs(HashMap<String, String> attrs) {
        this.attrs = attrs;
        return this;
    }

    public VueCommpontRender createVueCommpontRender() {
        return new VueCommpontRender(stfFile);
    }
}