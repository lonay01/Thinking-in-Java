package p220task12;

public class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
        System.out.println("Root");
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c2.dispose();
    }

}
