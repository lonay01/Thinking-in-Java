package p394task18;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class HoHumException2 extends Exception {
    public String toString() {
        return "A trivial exception2";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void dispose2() throws HoHumException2 {
        throw new HoHumException2();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                }
                finally {
                    lm.dispose2();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}