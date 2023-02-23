package p152task4;

public class Main {
    Main() {
        System.out.println("Вы создали объект класса!!!");
    }

    Main(String param) {
        System.out.println("Вы создали объект класса с идентефикатором : " + param);
    }

    public static void main(String[] args) {
        Main newEl = new Main();
        Main newEl1 = new Main("1");
    }
}
