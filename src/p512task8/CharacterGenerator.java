package p512task8;

import java.util.Iterator;
import java.util.Random;

public class CharacterGenerator implements Iterable<StoryCharacters>, Generator<StoryCharacters> {
    private int size = 0;
    private Class[] types = {Монстр.class, ДартВейдер.class, Шрек.class, Монстр.class};
    private static Random rand = new Random(47);
    public CharacterGenerator(int size) {
        this.size = size;
    }

    public CharacterGenerator() {

    }

    public StoryCharacters next() {
        try {
            return (StoryCharacters)
                    types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Iterator<StoryCharacters> iterator() {
        return new CharactersIterator();
    }



    class CharactersIterator implements Iterator<StoryCharacters> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return new CharacterGenerator().next();
        }
    }

    public static void main(String[] args) {
        for (StoryCharacters storyCharacters : new CharacterGenerator(5)) {
            System.out.println(storyCharacters);
        }
    }
}
