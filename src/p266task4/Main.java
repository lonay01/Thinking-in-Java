package p266task4;

import static p266task4.New.sm;

abstract class Base {
     void method() {};
}

class New extends Base {
    @Override
    public void method() {
        System.out.println("Я метод производного класса");
    }

    static void sm(Base base) {
        base.method();
    }
}
public class Main {
    public static void  main(String[] args) {
        sm(new New());
    }
}
