package p293task5;

class Main{
    class Inner {
    }
}

public class Outer {
    public static void main(String[] args) {
        Main main = new Main();
        Main.Inner inner = main.new Inner();
        System.out.println(inner);
    }
}
