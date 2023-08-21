package p339task11;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Main {

    int i;

    @Override
    public String toString() {
        return "Main{" +
                "i=" + i +
                '}';
    }

    public Main(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Collection<Main> mains1 = new LinkedList<>();
        Collection<Main> mains2 = new ArrayList<>();
        Collection<Main> mains3 = new HashSet<>();

        Main m1 = new Main(1);
        Main m2 = new Main(2);
        Main m3 = new Main(3);
        Main m4 = new Main(4);
        Main m5 = new Main(5);

        mains1.add(m1);
        mains1.add(m2);
        mains1.add(m3);
        mains1.add(m4);
        mains1.add(m5);

        mains2.add(m1);
        mains2.add(m2);
        mains2.add(m3);
        mains2.add(m4);
        mains2.add(m5);

        mains3.add(m1);
        mains3.add(m2);
        mains3.add(m3);
        mains3.add(m4);
        mains3.add(m5);

        Iterator<Main> it = mains1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it = mains2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it = mains3.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
