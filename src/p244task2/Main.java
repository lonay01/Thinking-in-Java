package p244task2;

import static p244task2.Generator.next;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = {next(3),next(4), next(0), next(0)};

        for (Shape sh: arr) {
            sh.doSmth();
        }
    }
}
