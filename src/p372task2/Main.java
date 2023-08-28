package p372task2;

public class Main {
    public static void main(String[] args) {
        String string = null;
        try {
            String[] arr  = string.split(" ");
            System.out.println("все ок");
        }
        catch (NullPointerException e) {
            System.out.println("перехвачено");
        }
    }
}
