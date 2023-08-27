package p351task27;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Command {
    String text;

    public Command(String text) {
        this.text = text;
    }

    public void operation() {
        System.out.println(text);
    }
}

class B {
    public Queue<Command> commandQueue = new LinkedList<>();

    public Queue<Command> operB(Command... c) {
        for (Command com : c) {
            commandQueue.offer(com);
        }

        return commandQueue;
    }
}

class C {
    public void operC(Queue<Command> commandQueue) {
        Iterator<Command> it = commandQueue.iterator();

        while (it.hasNext()) {
            it.next().operation();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();

        c.operC(b.operB(new Command("1"), new Command("3 "), new Command("1"), new Command("4")));
    }
}
