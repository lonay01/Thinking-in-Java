package p385task11;


class Exc1 extends Exception {};
class Exc2 extends Exception {
    Exc2(Exception e) {
        super(e);
    }
};

public class Main {

    public static void f() throws p385task10.Exc1 {}
    public static void g() throws p385task10.Exc1, p385task10.Exc2 {
        try {
            f();
            throw new p385task10.Exc1();
        }
        catch (p385task10.Exc1 e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)  {
        try {
            g();
        } catch (p385task10.Exc1 e) {
            e.printStackTrace(System.out);
        } catch (p385task10.Exc2 e) {
            e.printStackTrace(System.out);
        }
        catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
