package p269task7;

import java.util.Random;

interface Rodent {
    void name();

    void move();
}

class Mouse implements Rodent {
    @Override
    public void name() {
        System.out.println("Я мышка");
    }

    @Override
    public void move() {
        System.out.println("Мышь двинулась");
    }
}

class Hamster implements Rodent {
    @Override
    public void name() {
        System.out.println("Я хомячок");
    }
    @Override
    public void move() {
        System.out.println("Хомячок двинулся");
    }
}

class Capibara implements Rodent {
    @Override
    public void name() {
        System.out.println("Я капибара");
    }
    @Override
    public void move() {
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
