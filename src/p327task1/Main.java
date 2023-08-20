package p327task1;

import java.util.ArrayList;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println("Короткое сообщение : " + gerbilNumber);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<>();

        gerbilArrayList.add(new Gerbil(1));
        gerbilArrayList.add(new Gerbil(2));
        gerbilArrayList.add(new Gerbil(3));

        for (int i = 0; i < gerbilArrayList.size(); i++) {
            gerbilArrayList.get(i).hop();
        }
    }
}
