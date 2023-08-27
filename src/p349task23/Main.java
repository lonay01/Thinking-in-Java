package p349task23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(47);
        Map<Integer,Integer> arr = new HashMap<>();

        int uuu = 0;
        int maxDiff = 0;
        while (uuu < 30) {

            for ( int i = 0 ; i < 50; i ++) {
                int randomInt = random.nextInt(5);
                if (arr.containsKey(randomInt))
                arr.put(randomInt,arr.get(randomInt) + 1);
                else
                    arr.put(randomInt,1);
            }

            Iterator<Integer> it = arr.keySet().iterator();
            int avg = 0;
            int var = 0;
            maxDiff = 0;

            while (it.hasNext()) {
                avg += arr.get(it.next());
            }
            avg /= arr.keySet().size();

            it = arr.keySet().iterator();
            while (it.hasNext()) {
                var = arr.get(it.next()) - avg;
                if (var > maxDiff) {
                    maxDiff = var;
                }

            }
            System.out.println(maxDiff);
            uuu++;
        }
    }
}
