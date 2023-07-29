package p260task17;



class Status {
    public void move() {System.out.println("Status.move()");}
}

class Active extends Status {
    @Override
    public void move() {System.out.println("Active.move()");}
}

class Inactive extends Status {
    @Override
    public void move() {System.out.println("Inactive.move()");}
}

class Sleep extends Status {
    @Override
    public void move() {System.out.println("Sleep.move()");}
}

class AlertStatus {
    private Status st = new Active();
    public void off() {st = new Inactive();}

    public void on() {st = new Active();}

    public void sleep() {st = new Sleep();}

    public void move() {st.move();}
}

public class Starship {
    public static void main(String[] args) {
        AlertStatus a = new AlertStatus();
        a.move();
        a.off();
        a.move();
        a.sleep();
        a.move();
    }
}
