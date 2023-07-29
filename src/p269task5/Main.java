package p269task5;

import p269task5.realization.Base;

public class Main implements Base {
    @Override
    public void first() {
        System.out.println("first");
    }

    @Override
    public void second() {
        System.out.println("second");
    }

    @Override
    public void third() {
        System.out.println("third");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.first();
        m.second();
        m.third();
    }
}
