package p172task13;

public class Main {

    static int value1;
    static int value2;

    static {
        value1 = 1;
        value2 = 2;
    }

    public static void main(String[] args) {
        Main el1 = new Main();
        Main el2 = new Main();


        System.out.println(el1.value1);
        System.out.println(el2.value1);

        value1 = 110;

        System.out.println(el1.value1);
        System.out.println(el2.value1);
    }
}
