package p172task14;

class Construct {
    Construct(int val) {
        System.out.println("asdasd"  + val);
    }

    void func(int val) {
        System.out.println("f("+val + ")");
    }
}

class Use {
    static Construct c1;
    static Construct c2;

    static  {
        c1 = new Construct(1);
        c2 = new Construct(2);
    }

    public static void main(String[] args) {
        Use.c1.func(100);
    }
}
