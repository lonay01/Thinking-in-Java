package p145task2;

public class Main {
    String value = "123123123123";
    String value2 = "1";
    String value3 = value2;

    Main(String variable) {
        value2 = variable;
    }

    public static void main(String[] args) {
        Main val = new Main("newVALUE");
        System.out.println(val.value);
        System.out.println(val.value2);
        System.out.println(val.value3);


    }
}
