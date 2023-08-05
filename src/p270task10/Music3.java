package p270task10;


import p247task6.Note;

import java.util.Random;

interface Playable {
    void play(Note n);
}

class Instrument {


    void adjust() { System.out.println("Adjusting Instrument"); }

    @Override
    public String toString() {
        return "Instrument : " + super.toString() ;
    }
}

class Wind extends Instrument {
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument implements Playable {
    public void  play(Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument implements Playable{
    public void play(Note n) { System.out.println("Stringed.play() " + n); }
    String what() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind implements Playable{
    public void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind implements Playable{
    public void play(Note n) { System.out.println("Woodwind.play() " + n); }
    String what() { return "Woodwind"; }
}

class New extends Instrument {

}

public class Music3 {
    // Работа метода не зависит от фактического типа объекта,
    // поэтому типы, добавленные в систему, будут работать правильно:

//    public static Playable[] Rand(int counter) {
//        Playable[] res = new Playable[counter];
//        Random m = new Random(45);
//        for (int i = 0; i < counter; i ++) {
//            switch (m.nextInt(4)) {
//                default :
//                case 0: res[i] = (Playable) new Brass(); break;
//                case 1: res[i] = (Playable) new New(); break;
//                case 3: res[i] = (Playable) new Woodwind(); break;
//            }
//
//        }
//        return res;
//    }
    public static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:

        tune( new Stringed());
        tune( new Woodwind());
        System.out.println( new Instrument() );
        System.out.println(new Wind());
    }
}