package p361task32;
import java.util.*;

class PetSequence {
    protected int[] pets = {1,2,4,5,1};
}

public class NonCollectionSequence extends PetSequence implements Iterable<Integer> {

    public Iterable<Integer> reversed() {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    protected int index = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Integer next() {
                        return pets[index--];
                    }
                };
            }
        };
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Integer next() {
                return pets[index++];
            }
        };
    }

        public static void main (String[] args) {
            NonCollectionSequence nc = new NonCollectionSequence();
            for (Integer in : nc) {
                System.out.println(in);
            }
            System.out.println("++++++++++");
            for (Integer in : nc.reversed()) {
                System.out.println(in);
            }
        }
    }

