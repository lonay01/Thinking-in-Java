package p142task9;

public class Fibonacci {

    public static void FibonacciMethod(int value) {

        int res_prev_prev = 1;
        int res_prev = 1;

        if (value >= 1) {
            System.out.print(1);
        }

        if (value >= 2) {
            System.out.print(", ");
            System.out.print(1);
        }

        while (value != 0) {

            int res = res_prev + res_prev_prev;
            int buff = res_prev;
            res_prev = res;
            res_prev_prev = buff;
            System.out.print(", ");
            System.out.print(res);


            value--;
        }
    }

    public static void main(String[] args) {
        FibonacciMethod(10);
    }
}
