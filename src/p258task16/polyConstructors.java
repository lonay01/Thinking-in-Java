package p258task16;





class Glyph {
    public void draw() {

    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println(
                "RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    public void draw() {
        System.out.println(
                "RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int first = 3;
    private int second = 4;

    RectangularGlyph(int first,int second) {
        this.first = first;
        this.second = second;

        System.out.println("Rectangular(), first = " + this.first + " second = " + second );
    }

    public void draw() {
        System.out.println("Rectangular.draw(), first = " + this.first + " second = " + second);
    }
}

public class polyConstructors {

    public static void main(String[] args) {
        new RectangularGlyph(45,7);

    }
}
