package p340task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntBinaryOperator;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> rev  = new ArrayList<>();

        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            rev.add(listIterator.previous());
        }

        System.out.println(rev);
    }
}
