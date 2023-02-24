package p155task8;

public class Main {
    void foo(){
        foo1();
        this.foo1();
    }

    void foo1(){
        System.out.println("Hello!");
    };

    public static void main(String[] args) {
        Main newEl = new Main();
        newEl.foo();
    }
}
