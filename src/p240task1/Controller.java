package p240task1;

public class Controller {
    public static void F( Cycle c ) {
        c.moveForward();
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Unicycle u = new Unicycle();
        Tricycle t = new Tricycle();
        F(b);
        F(u);
        F(t);
    }
}
