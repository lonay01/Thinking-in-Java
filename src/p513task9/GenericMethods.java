package p513task9;

public class GenericMethods {
    public <T,V,U> void f (T x, Integer v, U u) {
        System.out.println(x.getClass().getName() + ", " + v.getClass().getName() + ", " + u.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("",1,1f);
    }
}
