package p306task18;

interface Int {
    void say();

    class Main implements Int {

        @Override
        public void say() {
            System.out.println("Main in interface");
        }

        public static void main(String[] args) {
            Main m = new Main();
            m.say();
        }
    }
}

