package p287task18;

interface CycleInterface {
    void move();
    void stop();
}

interface ServiceFactory {
    CycleInterface getService();
}
 class Unicycle implements CycleInterface {
    public void move() {
        System.out.println("Unicycle move()");
    }
     public void stop() {
         System.out.println("Unicycle stop()");
     }
}

class Bicycle implements CycleInterface {
    public void move() {
        System.out.println("Bicycle move()");
    }
    public void stop() {
        System.out.println("Bicycle stop()");
    }
}

class Tricycle implements CycleInterface {
    public void move() {
        System.out.println("Tricycle move()");
    }
    public void stop() {
        System.out.println("Tricycle stop()");
    }
}

class UniFactory implements ServiceFactory{
    public CycleInterface getService() {
        return new Unicycle();
    }
}

class BiFactory implements ServiceFactory{
    public CycleInterface getService() {
        return new Bicycle();
    }
}

class TriFactory implements ServiceFactory{
    public CycleInterface getService() {
        return new Tricycle();
    }
}

public class Factories {
    public static void service(ServiceFactory s) {
        CycleInterface c = s.getService();
        c.move();
        c.stop();
    }

    public static void main(String[] args) {
        service(new BiFactory());
        service(new UniFactory());
    }
}