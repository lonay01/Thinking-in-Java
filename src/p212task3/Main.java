package p212task3;

class First {
    First() {
        System.out.println("First");
    }
}

class Second extends First {
    Second() {
        System.out.println("Second");
    }
}

public class Main extends Second{
    Main() {
        System.out.println("Main");
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
