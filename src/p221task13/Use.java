package p221task13;

public class Use extends Base{
    void Method(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Use val = new Use();

        val.Method(1);
        val.Method(1f);
        val.Method('1');
        val.Method("1");
    }
}
