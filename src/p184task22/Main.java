package p184task22;

import static p184task22.Main.MONEY_TYPES.*;

public class Main {
    MONEY_TYPES typ;
    public   Main(MONEY_TYPES typ) {
        this.typ = typ;
    }

     static void Func(Main t ) {
         switch (t.typ) {
             case Euro : {
                 System.out.println("ЕВРОПА");
                 break;
             }
             case Pens : {
                 System.out.println("ХЗ");
                 break;
             }
         }
     }
    public enum MONEY_TYPES {
        Dollar, Ruble, Tenge, Euro, Yuan, Pens
    }
    public static void  main(String[] args) {
        Main typ1 = new Main(MONEY_TYPES.Euro);
        Main typ2 = new Main(Pens);

        Func(typ1);
        Func(typ2);


    }
}
