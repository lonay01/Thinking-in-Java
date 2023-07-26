package p244task5;

public class Controller {
    public static void F( Cycle c ) {
        c.moveForward();
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle(2);
        Unicycle u = new Unicycle(1);
        Tricycle t = new Tricycle(3);
        F(b);
        F(u);
        F(t);
        b.wheels();
    }
}
