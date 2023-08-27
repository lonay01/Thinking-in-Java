package p349task19;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);


        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int iter = it.next();
            System.out.print(iter + "  hashcode:  ");
            System.out.println(((Integer) iter).hashCode());
        }

    }
}
