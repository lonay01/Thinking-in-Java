package p297task7;

interface Int {
    void play();
}
public class Main {
    public Int mainPlay() {
        class Son implements Int {
            @Override
            public void play() {
                 System.out.println("Son()");
            }
        }

        return new Son();
    }

    public static void main(String [] args) {
        Main m = new Main();
        Int i1 = m.mainPlay();
        i1.play();
    }
}
