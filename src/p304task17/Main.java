package p304task17;

public class Main {
    static class Outer {
        static class Inner {

        }
    }

    public static void main(String[] args) {
        Main.Outer.Inner i = new Main.Outer.Inner();
    }
}
