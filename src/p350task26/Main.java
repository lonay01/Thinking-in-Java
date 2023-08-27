package p350task26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        String stringText = "My name is Kate. My surname is Pavlova. I'm seven. I live in Minsk, in Pushkin street. I go to school number 214. I'm in the first form.\n" +
                "\n" +
                "I've got a familyaaa. It is small. We are a family of four. I've got a father, a mother and a brother. I haven't got a sister. My father is.an engineer. He works in a plant. My mother is a teacher. She works at school. My brother is little. He doesn't go to school. He goes to a kindergarten. He is four.\n" +
                "\n" +
                "I like to play. I have got many toys. I have got a teddy-bear, dolls, a ball, a toy monkey and a doll's house. I like the doll's house very much. It is big. It is pink and nice.\n" +
                "\n" +
                "We have got a cat. It is small and grey. It is very nice. It has big blue eyes, a funny nose, a small mouth and sharp teeth. Its ears are small. It can play hide-and-seek. I love my cat. It loves me, too.";

        String[] words = stringText.split(" ");

        for ( int i = 0; i < words.length; i++) {
            if (map.get(words[i]) == null) {
                ArrayList<Integer> var = new ArrayList<>();
                var.add(i);
                map.put(words[i], var);
            }
            else {
                ArrayList<Integer> var = new ArrayList<>(map.get((words[i])));
                var.add(i);
                map.put(words[i], var);
            }
        }

        String res = "";
        int count = 0;

        for ( ArrayList<Integer> s : map.values()) {
            for ( int v : s) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            HashMap<Integer, String> map1 = new HashMap<>();
            for (String s : map.keySet()) {
                ArrayList<Integer> in = map.get(s);
                for (int j : in ) {
                    if (j == i)
                        res += (s + " ") ;
                }
            }
        }

        System.out.println(res);
    }
}
