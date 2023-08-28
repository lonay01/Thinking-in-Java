package p378task9;


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
            Main m = new Main();
            m.meth();
        }
        catch (Except1 | Except2 | Except3 e) {
            System.out.println(")");
        }
    }
}
