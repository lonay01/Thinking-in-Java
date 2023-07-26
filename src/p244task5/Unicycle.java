package p244task5;

public class Unicycle extends Cycle {
    Unicycle(int counter) {
        super(counter);
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Unicycle");
        System.out.println("");
    }
}
