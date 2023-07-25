package p231task20;

class A {
    private final void f() {
        System.out.println("Я метод из класса A");
    }
}

public class FinalOverridingIllusion extends A{
    //@Override    ЭТО НИКАК НЕ ПОМОЖЕТ, ПОТМОУ ЧТО В СУПЕРКЛАССЕ МЕТОД ПРИВАТНЫЙ
    private final void f() {
        System.out.println("Я метод из класса FinalOverridingIllusion");
    }

    public static void main(String[] args) {
        FinalOverridingIllusion obj = new FinalOverridingIllusion();
        obj.f();
    }
}