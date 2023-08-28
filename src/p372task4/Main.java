package p372task4;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exc("ERRORRRRRRR!!");
        }
        catch (Exc e) {
            e.print();
        }
    }
}
