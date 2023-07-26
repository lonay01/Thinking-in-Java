package p244task5;

public class Bicycle extends Cycle {
    Bicycle(int counter) {
        super(counter);
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Bicycle");
        System.out.println("");
    }
}
