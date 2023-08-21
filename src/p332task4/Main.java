package p332task4;

import p223task15.lib.Lib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import static p332task4.Generator.size;

class Generator {

    static int i = 0;

     static String[] fav_characters = {"Дональд Дак","Минни Маус","Дейзи Дак" , "Гуфи" , "Плуто" ,"Скрудж МакДак" ,"Билли, Вилли и Дилли" };
    public static  int size = fav_characters.length;
     String next() {
         if (i == fav_characters.length - 1)
             i = 0;
         return fav_characters[i++];
     }
}
public class Main {
    public static void main(String[] args) {
        Generator gen1 = new Generator();

        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        HashSet<String> stringHashSet = new HashSet<>();
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < size; i ++) {
            stringArrayList.add(gen1.next());
        }
        for (int i = 0; i < size; i ++) {
            stringLinkedList.add(gen1.next());
        }
        for (int i = 0; i < size; i ++) {
            stringHashSet.add(gen1.next());
        }
        for (int i = 0; i < size; i ++) {
            stringLinkedHashSet.add(gen1.next());
        }

        System.out.println(stringArrayList);
        System.out.println(stringLinkedList);
        System.out.println(stringHashSet);
        System.out.println(stringLinkedHashSet);

    }

}
