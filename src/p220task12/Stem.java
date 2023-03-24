package p220task12;

public class Stem extends Root {
    Stem() {
        super();
        System.out.println("Stem");
    }

    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    void dispose() {
        super.dispose();
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }

    public static void main(String[] args) {
        Stem st = new Stem();
        System.out.println("--------");
        Root r = new Root();
        st.dispose();
    }
}
