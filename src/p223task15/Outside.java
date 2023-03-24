package p223task15;

import p223task15.lib.Lib;

/* public class Outside {
    public static void main(String[] args) {
        Lib l = new Lib();
        l.Method();
    }

}
*/

public class Outside extends Lib {
    public static void main(String[] args) {
        Outside o = new Outside();
        o.Method();
    }

}