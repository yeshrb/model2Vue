import org.junit.Before;
import org.junit.Test;
import starter.VueCommpontRender;
import starter.VueCommpontRenderBuilder;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VueCommontRenderTest {
    VueCommpontRender render;
    @Before
    public void setUp(){

    }
    @Test
    public void test_create() throws Exception {
        String filePath = this.getClass().getClassLoader().getResource("VueComponent.stg").getPath();

        HashMap<String,String> attrs = new HashMap<>();
        attrs.put("title","birtaday");
        attrs.put("model","birtaday");
        attrs.put("data","birtaday-list");
        attrs.put("required","required");
        attrs.put("showName","showName");

        render = new VueCommpontRenderBuilder().setStfFile(filePath).setAttrs(attrs).createVueCommpontRender();
        String expected = "<XInput title=\"birtaday\" v-model=\"birtaday\"  placeholder=\"请选择birtaday\" required v-validate:birtaday:required=\"请选择birtaday\" />";
        String vueStr =  render.vueCommpontSTCreate("number");
        assertEquals(expected,vueStr);

    }
}
