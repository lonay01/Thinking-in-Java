package p373task5;

public class Main {
    public static void main(String[] args) {
        boolean cond = true;
        int i = 0;
        while (cond) {
            System.out.println(i);
            try {
                i++;
                if (i < 5)
                    throw new Exception();
                cond = false;
            }
            catch (Exception e) {
                System.out.println("Перехвачено");
            }
        }
    }
}
