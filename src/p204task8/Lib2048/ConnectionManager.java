package p204task8.Lib2048;

public class ConnectionManager {
    static int count = 0;
    public static Connection createCon() {
        if (count < 5) {
            count++;
            return new Connection();
        }
        else
            return null;

    }
}
