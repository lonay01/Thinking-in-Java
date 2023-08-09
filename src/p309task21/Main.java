package p309task21;

interface U {
    void play();
    void stop();
    void say();
}

class A {
    public U getU() {
        return new U() {
            @Override
            public void play() {
                System.out.println("play");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }

            @Override
            public void say() {
                System.out.println("say");
            }
        };
    }

    public U getU1() {
        return new U() {
            @Override
            public void play() {
                System.out.println("play1");
            }

            @Override
            public void stop() {
                System.out.println("stop1");
            }

            @Override
            public void say() {
                System.out.println("say1");
            }
        };
    }
}

class B {
    U[] val = new U[100];
    private static int i = 0;

    void save(U u) {
        val[i] = u;
        i++;
    }

    void makeNull(int per) {
        val[per] = null;
    }

    void doThis() {
        for (int j = 0; j < i; j++) {
            if (val[j] != null) {
                val[j].play();
                val[j].stop();
                val[j].say();
            }
            else
                System.out.println("NULL");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();

        B b = new B();

        b.save(a1.getU1());
        b.save(a2.getU());
        b.save(a3.getU1());
        b.save(a4.getU());
        b.save(a5.getU());

        b.makeNull(2);

        b.doThis();
    }
}
