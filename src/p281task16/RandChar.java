package p281task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandChar implements Readable {
    private int num;
    static Random random = new Random();

    RandChar(int num) {
        System.out.println("RandChar()");
        this.num = num;
    }

    public char nextChar() {
        char random_3_Char = (char) (97 + random.nextInt(26));
        return random_3_Char;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        System.out.println(num);

        if (num-- == 0)
            return -1;
        else
            cb.append(nextChar());

        return num;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandChar(2));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
