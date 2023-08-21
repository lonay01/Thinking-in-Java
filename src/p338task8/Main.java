package p338task8;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println("Короткое сообщение : " + gerbilNumber);
    }

    @Override
    public String toString() {
        return "Gerbil{" +
                "gerbilNumber=" + gerbilNumber +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<>();

        gerbilArrayList.add(new Gerbil(1));
        gerbilArrayList.add(new Gerbil(2));
        gerbilArrayList.add(new Gerbil(3));

        Iterator<Gerbil>  it = gerbilArrayList.iterator();

        while ( it.hasNext() ) {
            System.out.println(it.next());
        }
    }
}
