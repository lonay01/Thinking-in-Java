package p211task2;

public class Main extends Super {
    protected void Hello() {
        super.Hello();
        System.out.println("Изменения");
    }

    public static void main(String[] args) {
        Main m = new Main();
        Super s = new Super();
        m.i++;
        s.i--;
        System.out.println(m.i);
        System.out.println(s.i);
        m.Hello();
    }
}
