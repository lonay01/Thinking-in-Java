package p225task16;

public class Frog extends Amphibian{
    Frog (String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Frog zaba = new Frog("green");
        zaba.WhatsYourColor();
    }
}
