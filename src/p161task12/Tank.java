package p161task12;

public class Tank {

    boolean cond;
    void fill() {
        cond = true;
    }

    void drain() {
        cond = false;
    }

    public void finalize() {
        if (cond)
            System.out.println("Память освобождена");
    }

    public static void main(String[] args) {
        Tank tanker1 = new Tank();
        tanker1.fill();

        Tank tanker2 = new Tank();
        tanker2.drain();

        Tank tanker3 = new Tank();
        tanker3.fill();
        tanker3 = tanker1;

       new Tank();

       System.gc();
    }
}
