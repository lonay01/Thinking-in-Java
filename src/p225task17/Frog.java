package p225task17;

public class Frog extends Amphibian {

    @Override
    void WhatsYourColor() {
        System.out.println("I'm frog and my color is " + color);
    }

    Frog (String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Frog zaba = new Frog("green");
        zaba.WhatsYourColor();
        Amphibian a = new Amphibian();
        a.WhatsYourColor();
    }
}
