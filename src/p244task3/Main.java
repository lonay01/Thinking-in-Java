package p244task3;

import static p244task3.Generator.next;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = {next(3),next(4), next(0), next(1), next(0)};

        for (Shape sh: arr) {
            sh.erase();
        }
    }
}
