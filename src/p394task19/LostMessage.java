package p394task19;

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

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } catch (VeryImportantException e ) {
                System.out.println("VeryImportantException");
            }
            finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
A trivial exception
*///:~