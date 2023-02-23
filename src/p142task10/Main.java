package p142task10;

public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            forNumber:
            for (int j = 10; j < 100; j ++) {
                for (int k = 10; k < 100; k ++) {
                    if (k * j == i) {
                        System.out.print(i);
                        System.out.print(" = " + k + "*" + j);
                        System.out.println("");
                        break forNumber;
                    }
                }
            }
        }
    }
}
