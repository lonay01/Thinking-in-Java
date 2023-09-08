package p504task2;

public class ThreeClassHolder<T> {
    T first;
    T second;
    T third;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public ThreeClassHolder(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static void main(String[] args) {
        ThreeClassHolder<Integer> integerThreeClassHolder = new ThreeClassHolder<>(1,2,3);
        ThreeClassHolder<String> stringThreeClassHolder  = new ThreeClassHolder<>("a","22","sddf0");

        System.out.println(stringThreeClassHolder.getFirst());
    }
}
