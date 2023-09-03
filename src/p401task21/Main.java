package p401task21;

class Exc1 extends Exception{}

class Base {
    Base() throws Exc1 {
        throw new Exc1();

    }
}

//public class Main extends Base{
//    Main()  {
//        try {
//            super();
//        } catch (Exc1 e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void main(String[] args) throws Exc1 {
//
//    }
//}
