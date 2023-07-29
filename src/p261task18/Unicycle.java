package p261task18;

public class Unicycle extends Cycle {
    @Override
    public void moveForward() {
        super.moveForward();
        System.out.print(" Unicycle");
        System.out.println("");
    }

    public void balance() {System.out.println("Balance Uni");}
}
