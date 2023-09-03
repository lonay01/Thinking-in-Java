package p401task22;


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
    WithDispose withDispose1;
    FallingConstructor(int val) throws Exception {
        try {
            withDispose1 = new WithDispose(val);
            try {
                System.out.println(withDispose1);
                if (val == 0)
                    throw new IllegalArgumentException();
            } catch (Exception e) {
                WithDispose withDispose2 = new WithDispose(222);
                withDispose2.dispose();
            }
        }
        catch (Exception e ) {
            WithDispose withDispose2 = new WithDispose(232);
            withDispose2.dispose();
        }

    }

    public static void main(String[] args) {
        try {
            FallingConstructor fallingConstructor = new FallingConstructor(7);
        }
        catch (Exception e) {
            System.err.println("ASDSDSDSD");
            e.printStackTrace();
        }
    }
}
