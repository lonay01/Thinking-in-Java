package p349task20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Character> glas = new HashSet<>();
        glas.add('e');
        glas.add('u');
        glas.add('o');
        glas.add('a');
        glas.add('i');

        String stringText = "My name is Kate. My surname is Pavlova. I'm seven. I live in Minsk, in Pushkin street. I go to school number 214. I'm in the first form.\n" +
                "\n" +
                "I've got a familyaaa. It is small. We are a family of four. I've got a father, a mother and a brother. I haven't got a sister. My father is.an engineer. He works in a plant. My mother is a teacher. She works at school. My brother is little. He doesn't go to school. He goes to a kindergarten. He is four.\n" +
                "\n" +
                "I like to play. I have got many toys. I have got a teddy-bear, dolls, a ball, a toy monkey and a doll's house. I like the doll's house very much. It is big. It is pink and nice.\n" +
                "\n" +
                "We have got a cat. It is small and grey. It is very nice. It has big blue eyes, a funny nose, a small mouth and sharp teeth. Its ears are small. It can play hide-and-seek. I love my cat. It loves me, too.";

        String[] words = stringText.split(" ");
        List<Character> letters = new ArrayList<>();
        for ( String w : words ) {
            for ( char ch : w.toCharArray() ) {
                letters.add(ch);
            }
        }

        Map<Character,Integer> let = new HashMap<>();
        ListIterator<Character> it = letters.listIterator();
        let.put('e', 1);
        let.put('u', 1);
        let.put('o', 1);
        let.put('a', 1);
        let.put('i', 1);

        while (it.hasNext()) {
            char l = it.next();
            if (glas.contains(l)) {
                    System.out.println(1);
                    int var = let.get(l);
                    let.remove(l);
                    let.put(l, var + 1);
            }
        }

        System.out.println(let);
    }
}
