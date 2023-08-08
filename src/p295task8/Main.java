package p295task8;

public class Main {

    private void pr() {
        Inner in = new Inner();
        System.out.println(in.i);
    }

    class Inner {
        private int i = 19;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.pr();
    }
}
