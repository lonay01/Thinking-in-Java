package p372task4;

public class Exc extends Exception{
    String string;
    public Exc(String s) {
        string = s;
    }

    public void print() {
        System.out.println(string + "GGGGGGGGGGGGGG");
    }
}
