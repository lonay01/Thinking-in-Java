package p297task11;

interface Int {
    void play();
}
public class Main {

    public Int getInner() {
        return new Int() {
            public void play() {
                System.out.println("Я анонимный внутренний класс");
            }
            public void stop() {
                System.out.println("stop");
            }
        };
    }

    public static void main(String[] args) {
        Main m = new Main();
        Int i = m.getInner();
        i.play();
        //i.stop();
    }
}
