package p229task19;

public class Main {
    final int val1;

    Main() {
        val1 = 1;
    }

    Main(int a) {
        val1 = a;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Main m1 = new Main(13120);

        System.out.println(m.val1);
        System.out.println(m1.val1);
    }
}
