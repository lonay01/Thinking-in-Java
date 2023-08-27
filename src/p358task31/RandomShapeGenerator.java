package p358task31;

import p244task2.Circle;
import p244task2.Shape;
import p244task2.Square;
import p244task2.Triangle;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {

    private int count;
    RandomShapeGenerator (int count) {
        this.count = count;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < count;
            }
            public Shape next() {
                index++;
                return next1();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };

    }
    private Random random = new Random();

    public Shape next1() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator r = new RandomShapeGenerator(6);
        Iterator<Shape> it = r.iterator();

        for (Shape s : r) {
            System.out.println(r);
        }
    }

}