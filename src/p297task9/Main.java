package p297task9;

interface Int {
    void play();
}
public class Main {
    private class Inner implements Int {
        @Override
        public void play() {
            System.out.println("Я внутренний класс");
        }

        public void stop() {
            System.out.println("stop");
        }
    }

    public Int getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
            Main m = new Main();
            Int i = m.getInner();
            i.play();
            //i.stop();
    }
}
