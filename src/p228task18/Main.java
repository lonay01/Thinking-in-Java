package p228task18;

public class Main{
    static int i1;
    final String i2;
    private final int[] a1 = { 1 , 2 , 3 , 4 , 5 , 6 };
    static final String i3 = "SD";

    Main(String i2, int i1) {
        this.i2 = i2;
        this.i1 = i1;
    }

    public static void main(String[] args) {
        Main m1 = new Main("asd",1);
        System.out.println(m1.i2 + "     " + m1.i1 + "    "+    i3) ;


        Main m2 = new Main("gfh",2);
        System.out.println(m2.i2 + "     " + m2.i1 + "    "+    i3) ;
        System.out.println(m1.i2 + "     " + m1.i1 + "    "+    i3) ;


        m1.a1[2]++;
        for (int i = 0; i < m1.a1.length; i++)
        System.out.println(m1.a1[i]);

        System.out.println(m1.i2);
    }
}
