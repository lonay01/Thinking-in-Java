package p301task10;

interface Int {
    void play();
}
public class Main {
    public Int anInt() {
        return new Int() {
            public void play() {
                System.out.println("Son()");
            }
        };
    }
    public static void main(String [] args) {
        Main m = new Main();
        Int i1 = m.anInt();
        i1.play();
    }
}


