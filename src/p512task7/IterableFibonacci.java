package p512task7;

import java.util.Iterator;

public class IterableFibonacci
         implements Iterable<Integer> {
    private int n;
    private Fibonacci fib = new Fibonacci();
    public IterableFibonacci(int count) { n = count; }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return n > 0; }
            public Integer next() {
                n--;
                return fib.next();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for(int i : new IterableFibonacci(500))
            System.out.print(i + " ");
    }
}