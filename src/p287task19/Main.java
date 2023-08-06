package p287task19;

import p212task5.C;

import java.util.Random;

interface Game {
    void start();
    void restart();

}
interface GameFactory {
    Game getGame();
}

class Coin implements Game {

    public void start() {
        Random random = new Random();
        int val = random.nextInt(2);
        if (val == 1)
            System.out.println("Орел");
        else
            System.out.println("Решка");
    }
    public void restart() {
        Random random = new Random();
        int val = random.nextInt(2);
        if (val == 1)
            System.out.println("Орел");
        else
            System.out.println("Решка");
    }

}

class Cube implements Game {
    public void start() {
        Random random = new Random();
        int val = random.nextInt(6);
        System.out.println("Выпало : " + val);
    }
    public void restart() {
        Random random = new Random();
        int val = random.nextInt(6);
        System.out.println("Выпало : " + val);
    }
}

class CoinFactory implements GameFactory {
    public Game getGame() {
        return new Coin();
    }
}

class CubeFactory implements GameFactory {
    public Game getGame() {
        return new Cube();
    }
}

public class Main {
    public static void startGame(GameFactory g) {
        Game ng = g.getGame();
        ng.start();
        ng.restart();
    }

    public static void main(String[] args) {
        startGame(new CoinFactory());
        startGame(new CubeFactory());
    }
}
