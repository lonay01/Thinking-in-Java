package p303task15;

import p212task5.C;

import java.util.Random;

interface Game {
    void start();
    void restart();

}
interface GameFactory {
    Game getGame();
}

class Games {

    public static Game Coin() {
        return new Game() {
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
        };
    }
    public static Game Cube() {
        return new Game() {
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
        };
    }
}

public class Main {
    public static void startGame(Game g) {
        g.start();
        g.restart();
    }

    public static void main(String[] args) {
        startGame(Games.Coin());
        startGame(Games.Cube());
    }
}
