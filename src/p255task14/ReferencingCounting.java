package p255task14;

class Shared {
    // Count of a given class instance used in total.
    private int refcount = 0;
    // determine the count of instances of this class. Because it is STATIC, the entire class has only one copy.
    private static long count = 0;
    // Flag a given class instance. Because the class is called before use, it will default to a new object each time a new object is +1.
    private final long id = count++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Shared " + id;
    }

    @Override
    public void finalize() {
        System.out.println("Сработал GC в Shared");
        if (refcount != 0)
            System.out.println("Есть ошибка");
        else
            System.out.println("Все окей");
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }

    @Override
    public void finalize() {
        System.out.println("Сработал GC в Composing");
        shared.finalize();
    }

}

public class ReferencingCounting {


    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared), new Composing(shared) };
        new Composing(shared);
        System.gc();
    }
}