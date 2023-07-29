package p261task18;

public class Controller {
    public static void F( Cycle c ) {
        c.moveForward();
    }

    public static void main(String[] args) {

        Cycle[] arr = {new Unicycle(), new Bicycle(), new Tricycle()};

        ((Unicycle)arr[0]).balance();
        ((Bicycle)arr[1]).balance();
        ((Bicycle)arr[2]).balance(); // Exception in thread "main" java.lang.ClassCastException: class p261task18.Tricycle cannot be cast to class p261task18.Bicycle (p261task18.Tricycle and p261task18.Bicycle are in unnamed module of loader 'app')
                                     // at p261task18.Controller.main(Controller.java:14)
    }
}
