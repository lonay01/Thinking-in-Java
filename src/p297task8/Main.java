package p297task8;

interface Int {
    void play();
}
public class Main {
    public Int mainPlay(boolean per) {
        if (per) {
            class Son implements Int {
                @Override
                public void play() {
                    System.out.println("Son()");
                }
            }

            return new Son();
        }
        return null;
    }

    public static void main(String [] args) {
        Main m = new Main();
        Int i1 = m.mainPlay(true);
        i1.play();
    }
}
