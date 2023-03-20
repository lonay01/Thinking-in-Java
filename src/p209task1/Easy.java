package p209task1;

public class Easy {
    String val1;
    public String val2;

    Easy() {
        val1 = "valvalval";
        System.out.println("Вызван констурктор класса Easy");
    }


    public String toString() {
        if (val2 == null)
            val2 = "VaLLl";
        return  "val2 = " + val2;
    }
}
