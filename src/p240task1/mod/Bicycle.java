package p240task1.mod;

public class Bicycle extends Cycle {
    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Bicycle");
        System.out.println("");
    }
}
