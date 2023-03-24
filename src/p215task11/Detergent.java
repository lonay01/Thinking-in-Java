package p215task11;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }
}

public class Detergent {
    private String name = "Base";
    private Cleanser value = new Cleanser();

    public void dilute() {
        value.dilute();
    }

    public void apply() {
        value.apply();
    }

    public String toString() {

        return value.toString();
    }



    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();

        System.out.println(x);
        System.out.println("Testing base class:");

    }
}