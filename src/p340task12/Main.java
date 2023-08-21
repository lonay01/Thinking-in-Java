package p340task12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(4);
        List<Integer> list2 = new ArrayList<>(4);

        for (int i = 0 ; i < 4; i ++) {
            list2.add(0);
        }

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator(list2.size());

        while (it1.hasNext()) {
            it2.previous();
            it2.set(it1.next());
        }

        System.out.println(list2);

    }
}
