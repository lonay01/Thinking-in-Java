package p266task3;

abstract class Base {
    abstract void print();

    Base() {
        System.out.println("Я абстрактный класс");
        print();
    }
}

class New extends Base {
    int p = 2;

    New() {
        System.out.println("Я класс");
    }

    @Override
    void print() {
        System.out.println(p);
    }
}

public class Main {
    public static void main(String[] args) {
        New n = new New();
        n.print();
    }
}
