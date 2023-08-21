package p339task10;

import p247task8.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class Rodent {
    void name() {
        System.out.println("Я просто грызун");
    }

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

        List<Rodent> arr = new ArrayList<>(List.of(create(5)));
        Iterator<Rodent> it = arr.iterator();
        while (it.hasNext()){
            it.next().move();
        }
    }
}
