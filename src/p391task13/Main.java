package p391task13;


public class Main {

    public void meth() throws Except1, Except2, Except3 {
        if (1 == 1)
            throw new Except1();

        if (1 == 1)
        throw new Except2();

        if (1 == 1)
            throw new Except3();
    }
        public static void main(String[] args) {
        try {
            Main m = null;
            m.meth();
        }
        catch (Except1 | Except2 | Except3 e) {
            System.out.println(")");
        }
        finally {
            System.out.println("блок finally");
        }
    }
}
