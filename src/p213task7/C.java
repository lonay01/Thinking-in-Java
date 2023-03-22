package p213task7;

public class C extends A{
    C(int i) {
        super(i);
        System.out.println(" - C - ");
    }

    B b = new B(1);

    public static void main(String[] args) {
        C val = new C(11);
        C val1 = new C(11);
    }
}
