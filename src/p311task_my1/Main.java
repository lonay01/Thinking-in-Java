package p311task_my1;

interface SomeAction {
    void doAct();
}
class TempUp implements SomeAction {
    public void doAct() {
        System.out.println("Поднять температуру");
    }
}

class TempDown implements SomeAction {
    public void doAct() {
        System.out.println("Понизить температуру");
    }
}

class Button {
    SomeAction act;
    Button(SomeAction act) {
        this.act = act;
    }

    public void click() {
        act.doAct();
    }
}

class Lever {
    SomeAction act;
    Lever(SomeAction act) {
        this.act = act;
    }

    public void pull() {
        act.doAct();
    }
}

public class Main {
    public static void main(String[] args) {
        Button b = new Button(new TempUp());
        b.click();

        Lever l = new Lever(new TempDown());
        l.pull();
    }
}
