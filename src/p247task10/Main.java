package p247task10;

class Base {
    void m1() {
        System.out.println("first meethod");
    }

    void m2() {
        m1();
        System.out.println("second meethod");
    }
}

class Derived extends Base {
    @Override
    void m1() {
        System.out.println("Derivation");
    }
}
public class Main {
    public static void main(String[] args) {
        Base d = new Derived();
        d.m2();
    }
}
