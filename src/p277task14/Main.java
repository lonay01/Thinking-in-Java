package p277task14;

interface A {
    void a1();
    void a2();
}
interface B {
    void b1();
    void b2();
}
interface C {
    void c1();
    void c2();
}

interface D extends A, B, C {
    void d1();
}

class Base {
    void play() {
        System.out.println("Base.play()");
    }
}
public class Main extends Base implements D{
    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }

    @Override
    public void b1() {

    }

    @Override
    public void b2() {

    }

    @Override
    public void c1() {

    }

    @Override
    public void c2() {

    }

    @Override
    public void d1() {

    }

    public static void m1(A a) {
        System.out.println("A");
    }
    public static void m2(B a) {
        System.out.println("B");
    }

    public static void m3(C a) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m1(m);
        m2(m);
        m3(m);
        m.play();

    }
}
