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
        Main h = new Main();

        System.out.println(h);
        System.out.println(elem);

        elem = h;
        System.out.println(h);
        System.out.println(elem);
        System.out.println();
        System.gc();
        System.out.println("Free memory (bytes): " +
                Runtime.getRuntime().freeMemory());
    }
}
