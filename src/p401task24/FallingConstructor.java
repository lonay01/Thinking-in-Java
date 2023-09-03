package p401task24;


import p372task4.Exc;

class WithDispose {
    int i;

    WithDispose(int i ) throws Exception {
        if (i == 1) {
            throw new Exception();
        }
        this.i = i;
    }

    @Override
    public String toString() {
        return "WithDispose{" +
                "i=" + i +
                '}';
    }

    public void dispose() {
        System.out.println("dispose()" + this);
    }
}
public class FallingConstructor {

    public void dispose() {
        System.out.println("dispose falling");
    }

    FallingConstructor(int value) {
        try {
            WithDispose withDispose = new WithDispose(value);
            try {
                System.out.println(withDispose);
            }
            finally {
                withDispose.dispose();
            }
        }
        catch (Exception e) {
            System.out.println("Некорректное value (не удалось создать объект)");
        }
    }

    public static void main(String[] args) {
        FallingConstructor fallingConstructor = new FallingConstructor(2);
    }
}
