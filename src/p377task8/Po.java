package p377task8;

import p372task4.Exc;

public class Po {
    public void foo() throws Exc {
        try {
            throw new Exc("Po vs Exc");

        }
        catch (Exc e ) {
            e.print();
        }
    }
}
