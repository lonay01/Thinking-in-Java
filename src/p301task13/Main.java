package p301task13;

class A {
    A(int i) {
        System.out.println(" A() = " + i);
    }
    public void str() {
        System.out.println("Прив");
    }
}

public class Main {
    public A getA(int i) {
        return new A(i) {
            private int per = i + 1;
            {System.out.println("asDSDSDAsad");}
            public void str() {
                System.out.println("Прив1111");
            }
        };

    }

    public static void main(String[] args) {
        Main m = new Main();
        A a = m.getA(10);
        a.str();
        A a1 = new A(10111);
        a1.str();

    }
}
