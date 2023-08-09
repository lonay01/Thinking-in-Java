package p309task20;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    public A a1;

    class A {
        String s = "def";

        @Override
        public String toString() {
            return "Privet";
        }
    }

    public A getS() {
        return new A();
    }
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    public Selector reverseSelector() {
        return new Selector() {
            private int i = items.length - 1;
            public boolean end() { return i == 0; }
            public Object current() { return items[i]; }
            public void next() { if(i >= 0) i--; }
            public Sequence getSeq() {return Sequence.this;}
        };
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        public Sequence getSeq() {return Sequence.this;}
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector Reverseselector() {
        return reverseSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.Reverseselector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}