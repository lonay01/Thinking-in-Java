package p319myTask;

class Egg2 {

    public Egg2() {
        System.out.println("new Egg2()");            //2
    }

    public void insertYolk(Yolk y) {
        this.y = y;
    }

    private Yolk y = new Yolk();

    public void g() {
        y.f();
    }
    public class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk");       //1  //3
        }

        public void f() {
            System.out.println("Egg2.Yolk.f");
        }
    }
}

public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk");         //4
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f");
        }
    }
    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 egg2 = new BigEgg2();
        System.out.println(".");
        egg2.g();
    }
}

