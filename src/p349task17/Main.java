package p349task17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Map<String,Gerbil> stringGerbilMap = new HashMap<>();

        stringGerbilMap.put("1", new Gerbil(1));
        stringGerbilMap.put("2", new Gerbil(2));
        stringGerbilMap.put("3", new Gerbil(3));
        stringGerbilMap.put("4", new Gerbil(4));
        stringGerbilMap.put("5", new Gerbil(5));

        Iterator<String> it = stringGerbilMap.keySet().iterator();

        while (it.hasNext()) {
            String iter = it.next();
            System.out.print(iter+ "   ");
            stringGerbilMap.get(iter).hop();
        }

    }
}

