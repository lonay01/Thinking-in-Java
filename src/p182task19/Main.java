package p182task19;

public class Main {
    static void method(String... strings) {
        System.out.println(strings);
    }

    public static void main(String[] args) {

        method("123","456","789");
        String[] arr = new String[3];

        arr[0] = new String("rty");
        arr[1] = new String("yuo");
        arr[2] = new String("dcv");
        method(arr);

    }
}
