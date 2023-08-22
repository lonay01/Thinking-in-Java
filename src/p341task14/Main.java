package p341task14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        ListIterator<Integer> it = integerLinkedList.listIterator();

        it.add(1);
        it.add(2);
        it.add(3);

        System.out.println(integerLinkedList);
    }
}
