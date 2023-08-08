package p292task3;

public class Outer {
    private String info;
    Outer(String info) {
        this.info = info;
    }
    private int val  = 1;
    class Inner {
        Inner(String s) {
            System.out.println(s);
        }

        @Override
        public String toString() {
            return info;
        }
    }

    public Outer.Inner getInner() {
        return new Outer.Inner("ppp");
    }

    public static void main(String[] args) {
        Outer o1 = new Outer("Secret");
        Outer.Inner i1 = o1.getInner();
        System.out.println(i1);
    }
}
