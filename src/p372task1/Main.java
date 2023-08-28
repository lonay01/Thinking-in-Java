package p372task1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }

    }
}
