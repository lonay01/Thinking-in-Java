package p269task8;


interface FastFood {
    void fire();
    void salt();
}
class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Pickle {
    Pickle() { System.out.println("Pickle()"); }  //New class pickle
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();		//Picle constructor call
    public Sandwich() { System.out.println("Sandwich()"); }

    @Override
    public void fire() {
        System.out.println("Пожарить хлеб");
    }

    @Override
    public void salt() {
        System.out.println("Посолить");
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.fire();
        s.salt();
        }
    }
