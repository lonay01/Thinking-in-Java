package p153task5;

public class Dog {
    void bark() {
        System.out.println("Гав");
    }

    void bark(int param) {
        System.out.println("УОУОУООУОУ");
    }

    void bark(char param) {
        System.out.println("вивививиививив");
    }

    public static void main(String[] args) {
        Dog Labrador = new Dog();

        Labrador.bark();
        Labrador.bark(1);
        Labrador.bark('c');
    }
}
