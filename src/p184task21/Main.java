package p184task21;

public class Main {
        public enum MONEY_TYPES {
            Dollar, Ruble, Tenge, Euro, Yuan, Pens
        }
    public static void  main(String[] args) {
        for (MONEY_TYPES m : MONEY_TYPES.values()) {
            System.out.println(m + " : " + m.ordinal());
        }
    }
}
