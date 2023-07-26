package p244task5;

public class Tricycle extends Cycle {
    Tricycle(int counter) {
        super(counter);
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Tricycle");
        System.out.println("");
    }
}
