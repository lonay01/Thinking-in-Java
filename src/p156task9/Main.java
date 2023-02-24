package p156task9;

public class Main {
    Main(int val) {
        System.out.println(val);
    }

    Main(String val1, int val2) {
        this(val2);
        System.out.println(val1);
    }

    public static void main(String[] args) {
        Main first = new Main(1);
        Main second = new Main("1231230", 2);
    }
}
