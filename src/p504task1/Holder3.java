package p504task1;

public class Holder3<T> {
    private T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public Holder3(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Number> h3Int= new Holder3<>(1);
        h3Int.setA(3.2);
        System.out.println(h3Int.getA()     );
    }
}
