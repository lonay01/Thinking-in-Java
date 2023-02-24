package p161task10;

public class Main {
    boolean cond = false;

    Main() {
        cond = true;
    }
    @Override
    public void finalize() {
        if (cond)
            System.out.println("ОСВОБОДИ КОЗЕЛ");
    }

    public void Cleaner() {
        cond = false;
    }
    public static void main(String[] args) {
        Main elem = new Main();
        elem.Cleaner();
        Main elem1 = new Main();
        System.gc();
    }
}
