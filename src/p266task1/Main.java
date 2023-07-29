package p266task1;

import java.util.Random;

abstract class Rodent {
    abstract void name();

    void move() {
        System.out.println("Грызун двинулся");
    }
}

class Mouse extends Rodent {
    @Override
    void name() {
        System.out.println("Я мышка");
    }
}

class Hamster extends Rodent {
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
    @Override
    void name() {
        System.out.println("Я капибара");
    }
    @Override
    void move() {
        System.out.println("Капибара двинулась");
    }
}

public class Main {
    static Rodent[] create(int counter) {
        Rodent[] res = new Rodent[counter];
        Random m = new Random();
        for (int i = 0; i < counter; i ++) {
            switch (m.nextInt(3)) {
                default :
                case 0: res[i] = new Capibara(); break;
                case 1: res[i] = new Hamster(); break;
                case 2: res[i] = new Mouse(); break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Rodent[] arr = create(5);

        for (Rodent r : arr) {
           // r.name();
            r.move();
        }
    }
}
