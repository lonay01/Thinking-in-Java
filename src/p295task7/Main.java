package p295task7;

public class Main {
    private int i = 10;
    private void method() { System.out.println("private()"); }

    class Inner {
        public void change() {
            i = 15;
            method();
        }
    }

    void get() {
        Inner i1 = new Inner();
        i1.change();
        System.out.println(" i = "+ i);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.get();
    }
}
