package p349task22;

import java.util.*;

class Word {
    private String word;
    private int counter = 1;

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", counter=" + counter +
                '}';
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCounter() {
        return counter;
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "Some strange text in Engilsh in";
        String[] words = input.split(" ");
        Set<String> wordString = new HashSet<>();
        Map<String,Word> arr = new HashMap<>();

        int counter = 0;

        for (String w : words) {
            if ( wordString.contains(w)) {
                Word ww = arr.get(w);
                ww.setCounter(ww.getCounter()+1);
            }
            else
            {
             arr.put(w, new Word(w));
             wordString.add(w);
            }

        }

        System.out.println(arr);
    }
}
