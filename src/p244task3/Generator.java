package p244task3;


public class Generator {
    public static Shape next(int i) {
        switch (i) {
            default:
            case 0:
                return new Circle();
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            case 1:
                return new NewClass();
        }
    }
}
