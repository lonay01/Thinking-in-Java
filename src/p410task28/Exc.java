package p410task28;

public class Exc extends RuntimeException{
    String string;
    public Exc(String s) {
        string = s;
    }

    public void print() {
        System.out.println(string + "GGGGGGGGGGGGGG");
    }
}
