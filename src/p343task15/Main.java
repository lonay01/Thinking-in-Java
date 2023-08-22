package p343task15;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T t) { storage.addFirst(t); }
    public void peek() {
        storage.getFirst();
        System.out.println(storage.getFirst());
    }
    public void pop() { storage.removeFirst(); }

    @Override
    public String toString() {
        return "Stack{" +
                "storage=" + storage.toString() +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();

        String input = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

        char[] inputArr = input.toCharArray();

        for (int i=0; i < inputArr.length; i++ ) {
            if (inputArr[i] == '+') {
                characterStack.push(inputArr[i+1]);
            }
            else if (inputArr[i] == '-') {
                characterStack.peek();
                characterStack.pop();
            }
        }

    }
}
