package p301task12;

public class HorrorShow {

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerMonster barney = new DangerMonster() {
            @Override
            public void destroy() {}
            @Override
            public void menace() {}
        };
        u(barney);
        v(barney);

        Vampire vlad = new Vampire() {

            @Override
            public void drinkBlood() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

interface Monster {

    void menace();
}

interface DangerMonster extends Monster {

    void destroy();
}

interface Lethal {

    void kill();
}

class DragonZilla implements DangerMonster {

    public void menace() {
        System.out.println(getClass().getSimpleName()+" menace()");
    }

    public void destroy() {
        System.out.println(getClass().getSimpleName()+" destroy()");
    }
}

interface Vampire extends DangerMonster, Lethal {

    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    public void menace() {
        System.out.println(getClass().getSimpleName()+" menace()");
    }

    public void destroy() {
        System.out.println(getClass().getSimpleName()+" destroy()");
    }

    public void kill() {
        System.out.println(getClass().getSimpleName()+" kill()");
    }

    public void drinkBlood() {
        System.out.println(getClass().getSimpleName()+" drinkBlood()");
    }
}
