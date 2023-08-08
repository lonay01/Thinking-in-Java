package p295task6.out;

import p212task5.C;
import p295task6.Main;
import p295task6.in.Inter;

import javax.swing.*;

public class Class1 extends Main {
    Inter method() {
        Main m = new Main();
        return m.get();
    }
    public static void main(String[] args) {
        Class1 cl = new Class1();
        System.out.println(cl.method());
    }
}
