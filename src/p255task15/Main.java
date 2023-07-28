package p255task15;

import p212task5.C;

import java.util.Random;

class Rodent {

    static {System.out.println("Rodent");}
    void name() {
        System.out.println("Я просто грызун");
    }

    void move() {
        System.out.println("Грызун двинулся");
    }
}


class Head {
    private int refcount = 0;
    // determine the count of instances of this class. Because it is STATIC, the entire class has only one copy.
    private static long count = 0;
    // Flag a given class instance. Because the class is called before use, it will default to a new object each time a new object is +1.
    private final long id = count++;

    public Head() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Head " + id;
    }

    @Override
    public void finalize() {
        System.out.println("Сработал GC в Shared");
        if (refcount != 0)
            System.out.println("Есть ошибка");
        else
            System.out.println("Все окей");
    }

}


class Mouse extends Rodent {
    @Override
    void name() {
        System.out.println("Я мышка");
    }
}

class Hamster extends Rodent {

    static {System.out.println("Hamster");}
    @Override
    void name() {
        System.out.println("Я хомячок");
    }
    @Override
    void move() {
        System.out.println("Хомячок двинулся");
    }
}

class Capibara extends Rodent {

    private Head h;

    private static long counter = 0;
    private final long id = counter++;

    @Override
    void name() {
        System.out.println("Я капибара");
    }
    @Override
    void move() {
        System.out.println("Капибара двинулась");
    }

    public Capibara(Head h) {
        System.out.println("Creating " + this);
        this.h = h;
        this.h.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        h.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }

    @Override
    public void finalize() {
        System.out.println("Сработал GC в Composing");
        h.finalize();
    }
}

class SuperHamster extends Hamster {

    private static long counter = 0;
    private final long id = counter++;
    private Head h;
    public SuperHamster(Head head) {
        System.out.println("Creating " + this);
        this.h = head;
        head.addRef();
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        h.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }

    @Override
    public void finalize() {
        System.out.println("Сработал GC в Composing");
        h.finalize();
    }

    static {System.out.println("SuperHamster");}
}
public class Main {
//    static Rodent[] create(int counter) {
//        Rodent[] res = new Rodent[counter];
//        Random m = new Random();
//        for (int i = 0; i < counter; i ++) {
//            switch (m.nextInt(3)) {
//                default :
//                case 0: res[i] = new Capibara(); break;
//                case 1: res[i] = new Hamster(); break;
//                case 2: res[i] = new Mouse(); break;
//            }
//
//        }
//        return res;
//    }

    public static void main(String[] args) {
//        Rodent[] arr = create(5);
//
//        for (Rodent r : arr) {
//            // r.name();
//            r.move();
//        }
        Head h = new Head();
        SuperHamster[] arr = {new SuperHamster(h),new SuperHamster(h),new SuperHamster(h),new SuperHamster(h),new SuperHamster(h)};
        for (SuperHamster sh: arr) {
            sh.dispose();
        }
    }
}
