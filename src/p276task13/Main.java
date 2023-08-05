package p276task13;


interface A {
    void play();
    void move();
}

interface B extends A{
    void jump();
    void move();
}

interface C extends B, A{
    void ride();

}
public class Main implements C{

    @Override
    public void play() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void move() {

    }

    @Override
    public void ride() {

    }
}
