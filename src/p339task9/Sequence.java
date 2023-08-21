package p339task9;

import java.util.ArrayList;
import java.util.Iterator;

//interface Selector {
//    boolean end();
//    Object current();
//    void next();
//}

public class Sequence {

    private ArrayList<Integer> items;

    Sequence(int initCapacity) {
        items = new ArrayList<>(initCapacity);
    }

    public Iterator<Integer> getIterator() {
        return items.iterator();
    }

    public void addValue(int val) {
        items.add(val);
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        for(int i = 0; i < 100; i++)
            sequence.addValue(i);

        Iterator<Integer> it = sequence.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
/* Output:
0 1 2 3 4 5 6 7 8 9
*/