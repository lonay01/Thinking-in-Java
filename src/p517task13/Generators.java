package p517task13;

import p512task7.Fibonacci;
import p512task7.Generator;

import java.util.*;

public class Generators {
    public static <T> List<T>
    fill0(List<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            coll.add(gen.next());
            System.out.println(coll.getClass());
        }
        return (List)coll;
    }
    public static <T> Queue<T>
    fill1(Queue<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return (Queue<T>) coll;
    }
    public static <T> Set<T>
    fill2(Set<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return (Set<T>)coll;
    }
    public static void main(String[] args) {

        Collection<Integer> fnumbers = fill0(
                new ArrayList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + ", ");


    Collection<Integer> fnumbers1 = fill0(
            new LinkedList<Integer>(), new Fibonacci(), 12);
        for(int i : fnumbers1)
            System.out.print(i + ", ");
}
}