package p173task15;

class Construct {
    Construct(int val) {
        System.out.println("asdasd"  + val);
    }

    void func(int val) {
        System.out.println("f("+val + ")");
    }
}

class Main {
    Construct c1;
    Construct c2;

      {
        c1 = new Construct(1);
        c2 = new Construct(2);
    }

    public static void main(String[] args) {
        Main elem = new Main();
        elem.c1.func(1);
    }
}
