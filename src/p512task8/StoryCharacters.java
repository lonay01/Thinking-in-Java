package p512task8;

public class StoryCharacters {
    private static long counter = 0;
    private final long id = counter++;

    StoryCharacters() {
        System.out.println("StoryCharacters");
        System.out.println(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

    public static void main(String[] args) {
        Осел ослик = new Осел();
        Шрек шрек = new Шрек();
    }
}

class GoodGuys extends StoryCharacters {
    GoodGuys() {
        System.out.println("GoodGuys");
    }
}
class BadGuys extends StoryCharacters {}

class Осел extends GoodGuys {
    Осел() {
        System.out.println("Осел");
    }
}
class Шрек extends GoodGuys {
    Шрек() {
        System.out.println("Шрек");
    }
}

class ДартВейдер extends BadGuys {}
class Монстр extends BadGuys {}
