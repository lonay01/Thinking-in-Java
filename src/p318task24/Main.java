package p318task24;

class Outer {
    class Inner {
        Inner(String str) {
            System.out.println(str);
        }
    };
    public static void main(String[] args) {
        Main.Main1 m = new Main().new Main1(new Outer(), "sdsd");
    }
}

public class Main {
class Main1 extends Outer.Inner {
    Main1(Outer o, String str) {
        o.super(str);
        }
    }


}
