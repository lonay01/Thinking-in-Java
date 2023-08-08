package p290task1;

public class Outer {
    private int val  = 1;
    class Inner {
        Inner(String s) {
            System.out.println(s);
        }
    }

    public Inner getInner() {
        return new Inner("ppp");
    }

    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.getInner();
        System.out.println(o1.val);
    }
}
