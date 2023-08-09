
package p303task14;


import p247task6.Note;

import java.util.Random;

interface Instrument {
    void play(Note n);
    void adjust();
    String what();
}



class Many  {
    public static Instrument Wind() {
        return new Instrument() {
            public void play(Note n) {
                System.out.println("Wind.play() " + n);
            }

            public String what() {
                return "Wind";
            }

            public void adjust() {
                System.out.println("Adjusting Wind");
            }
        };
    };

        public static Instrument Percussion() {
            return new Instrument() {
                public void play(Note n) {
                    System.out.println("Percussion.play() " + n);
                }

                public String what() {
                    return "Percussion";
                }

                public void adjust() {
                    System.out.println("Adjusting Percussion");
                }
            };

        }

    public static Instrument Stringed() {
        return new Instrument() {
            public void play(Note n) { System.out.println("Stringed.play() " + n); }
            public String what() { return "Stringed"; }
            public void adjust() { System.out.println("Adjusting Stringed"); }
        };

    }
    }



class Stringed implements Instrument {
    public void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String what() { return "Stringed"; }
    public void adjust() { System.out.println("Adjusting Stringed"); }
}


public class Music3 {
    // Работа метода не зависит от фактического типа объекта,
    // поэтому типы, добавленные в систему, будут работать правильно:

//    public static Instrument[] Rand(int counter) {
//        Instrument[] res = new Instrument[counter];
//        Random m = new Random(45);
//        for (int i = 0; i < counter; i ++) {
//            switch (m.nextInt(4)) {
//                default :
//                case 0: res[i] = new Brass(); break;
//                case 1: res[i] = new New(); break;
//                case 2: res[i] = new Wind(); break;
//                case 3: res[i] = new Woodwind(); break;
//            }
//
//        }
//        return res;
//    }
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        System.out.println(Many.Wind());
        System.out.println(Many.Percussion());
        System.out.println(Many.Stringed());
        tune(Many.Percussion());
    }
}