package p295task6;

import p295task6.in.Inter;

public class Main {
    public Inner get() {
        return new Inner();
    }
    protected class Inner implements Inter {

        @Override
        public void printInter() {
            System.out.println("Inner class");
        }
    }
}
