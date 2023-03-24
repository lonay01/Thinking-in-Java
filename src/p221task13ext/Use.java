package p221task13ext;

public class Use extends Base {
    void Method(String a) {
        System.out.println(a);
    }

    @Override
    void  Method(int a) {
        System.out.println("ASDASDASDASDASDASD");
    }

    public static void main(String[] args) {
        Use val = new Use();

        val.Method(1);
        val.Method(1f);
        val.Method('1');
        val.Method("1");
    }
}
