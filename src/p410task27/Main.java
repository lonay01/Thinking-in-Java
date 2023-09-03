package p410task27;

public class Main {
    public static void main(String[] args) {
        try {
            int[] sss = {1,2,2};
            sss[5] = 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Перехвачено");
            throw new RuntimeException(arrayIndexOutOfBoundsException);
        }
    }
}
