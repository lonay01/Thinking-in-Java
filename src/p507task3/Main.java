package p507task3;

public class Main {
    static SixTuple<Integer, String, Double, Boolean, Float, Number> TestSix(Integer a, String s, Double d, Boolean b, Float c, Number nUmber) {
        return new SixTuple<Integer,String,Double,Boolean,Float,Number>(a,s,d,b,c,nUmber);
    }
    public static void main(String[] args) {
        System.out.println(TestSix(1,"sss",1.0,true,1f,11).getA());
    }
}
