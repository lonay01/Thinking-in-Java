package p213task8;

public class Usable extends Base {
    Usable() {
        super(1);
        System.out.println("Without args");
    }

    Usable(int i ) {
        super(i);
        System.out.println("Usable : " + i);
    }

    public static void main(String[] args) {
        Usable a = new Usable(11);
        Usable a1 = new Usable();
    }
}
