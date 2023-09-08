package p507task4;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence<T> {
    private T[] items;
    private int next = 0;
    public Sequence(int size) {
        items = (T[]) new Object[size];
    }
    public void add(T x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence<Integer> sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Sequence<String> sequence1 = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence1.add("a" + i);
        Selector selector1 = sequence1.selector();
        while(!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
/* Output:
0 1 2 3 4 5 6 7 8 9
*/