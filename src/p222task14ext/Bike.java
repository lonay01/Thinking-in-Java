package p222task14ext;

public class Bike extends Move  {
    Bike() {
        Wheel wh1 = new Wheel();
        Wheel wh2 = new Wheel();
        Transmission ts = new Transmission();
    }
    public static void main(String[] args) {

        Bike b = new Bike();
        b.go();
    }

}
