package starter;

import java.util.HashMap;

public class ComponnetFacactory {

    public static Commponet create(String type) {
        Commponet componnet = new Commponet();
        componnet.setType(type);
        return componnet;
    }
}
