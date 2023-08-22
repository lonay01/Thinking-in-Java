package p349task18;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1,"a");
        integerStringHashMap.put(3,"b");
        integerStringHashMap.put(2,"c");


        Iterator<Integer> it = integerStringHashMap.keySet().iterator();

        while (it.hasNext()) {
            int iter = it.next();
            System.out.print(integerStringHashMap.get(iter) + "  hashcode:  ");
            System.out.println(((Integer) iter).hashCode());
        }

        Set<Integer> KeySet = integerStringHashMap.keySet();
        Set<Integer> sortedKeySet = new TreeSet<>(Comparator.reverseOrder());
        sortedKeySet.addAll(KeySet);

        Map<Integer,String> SortedIntegerStringMap = new LinkedHashMap<>();
        for (Integer i : sortedKeySet) {
            SortedIntegerStringMap.put(i, integerStringHashMap.get(i));
        }

        System.out.println("LinkedHashMap: " + SortedIntegerStringMap);
    }
}
