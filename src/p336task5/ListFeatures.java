package p336task5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> pets = new ArrayList<>();
        print("1: " + pets);
        Integer h = new Integer(1);
        pets.add(h);
        pets.add(2432);
        pets.add(34342);
        pets.add(23423);
        // Automatically resizes
        print("2: " + pets);
        print("3: " + pets.contains(h));
        pets.remove(h); // Remove by object
        int f = pets.get(2);
        print("4: " + f + " " + pets.indexOf(f));
        Integer cymric = new Integer(23423);
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        // Must be the exact object:
        print("7: " + pets.remove((Integer) f));
        print("8: " + pets);
        pets.add(2, new Integer(152)); // Insert at an index
        print("9: " + pets);

    }
}