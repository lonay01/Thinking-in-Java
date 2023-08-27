package p353task28;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>();

        Random random = new Random(47);

        for ( int i = 0; i < 20 ; i ++) {
            doublePriorityQueue.offer(random.nextDouble());
        }

        while (!doublePriorityQueue.isEmpty()) {
            System.out.println(doublePriorityQueue.poll());
        }
    }
}
