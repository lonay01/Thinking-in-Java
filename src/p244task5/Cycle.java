package p244task5;

public class Cycle {
    Cycle(int counter) {
        this.counter = counter;
    }
    int counter = 0;
    public void moveForward() {
        System.out.print("Двигаться вперед");
    }
    public void wheels() {System.out.println("Количество колес = " + counter);}
}
