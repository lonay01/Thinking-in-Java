package p261task18;

public class Bicycle extends Cycle {
    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Bicycle");
        System.out.println("");
    }

    public void balance() {System.out.println("Balance Bi");}
}
