package p349task24;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<String,String> stringStringLinkedHashMap = new LinkedHashMap<>();

        stringStringLinkedHashMap.put("1","1");
        stringStringLinkedHashMap.put("2","2");
        stringStringLinkedHashMap.put("4","4");
        stringStringLinkedHashMap.put("3","3");
        stringStringLinkedHashMap.put("5","5");

        System.out.println(stringStringLinkedHashMap);

        List<String> list = new ArrayList<>(stringStringLinkedHashMap.keySet());
        Collections.sort(list);

        Iterator<String> it = list.iterator();
        LinkedHashMap<String,String> stringStringLinkedHashMapSort = new LinkedHashMap<>();

        while (it.hasNext()) {
            String v = it.next();
            stringStringLinkedHashMapSort.put(v,stringStringLinkedHashMap.get(v));
        }

        System.out.println(stringStringLinkedHashMapSort);
    }
}
