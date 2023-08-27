package p356task30;//: holding/CollectionSequence.java

import java.util.*;
public class CollectionSequence
        implements Collection<Integer> {
    private int[] pets = {1,2,3,4,5,6,7,9,8};
    public int size() { return pets.length; }

    @Override
    public boolean isEmpty() {
        if (pets.length == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i : pets) {
            if (i == (int) o)
                return true;
        }
        return false;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Integer next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        System.out.println(c.contains(1));

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}