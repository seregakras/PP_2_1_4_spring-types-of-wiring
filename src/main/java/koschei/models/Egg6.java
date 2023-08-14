package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {

    @Autowired
    private Deth8 deth;

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
