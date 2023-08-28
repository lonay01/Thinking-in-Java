package p376task7;


public class Main {
    public static void main(String[] args) {
        try {
            int[] sss = {1,2,2};
            sss[5] = 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.err.println("Перехвачено");
            System.err.println(arrayIndexOutOfBoundsException);
        }
    }
}
