package p385task10;

;
;

public class Main {

    public static void f() throws Exc1{}
    public static void g() throws Exc1, Exc2 {
        try {
            f();
            throw new Exc1();
        }
        catch (Exc1 e) {
            throw new Exc2(e);
        }
    }
    public static void main(String[] args)  {
        try {
            g();
        } catch (Exc1 e) {
            e.printStackTrace();
        } catch (Exc2 e) {
            e.printStackTrace();
        }
    }
}
