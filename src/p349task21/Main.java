package p349task21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Some strange text in Engilsh in";
        String[] words = input.split(" ");

        Map<String ,Integer> map =  new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w,map.get(w)+1);
            }
            else
                map.put(w,1);
        }

        System.out.println(map);
    }
}
