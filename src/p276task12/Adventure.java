package p276task12;



interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    public void climb();
}
class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly,CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}

public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) {x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void c(CanClimb x) {x.climb();}
    public static void w(ActionCharacter x) {x.fight();}
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        c(h);
    }
}
