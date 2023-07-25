package p235task23;


class A {
    final int i  = 8;
    final static int i1 = 0;
    static int s = p();

    static void m() {
        System.out.println("Я метод из класса A");
    }

    static int p() {
        System.out.println("Я метод p() из класса A");
        return 2;
    }
}
public class Main extends A{
    static void m1() {
        System.out.println("Я метод из класса A");
    }
    public static void main(String[] args) {

        //A a = new A();
        //m();

    }

}
