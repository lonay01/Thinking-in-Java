package p153task6;

public class Dog {
    void Gaw( int var1, String var2) {
        System.out.println("Сначала int, а потом String");
    }

   void Gaw(String var1, int var2) {
        System.out.println("Сначала String, а потом int");
   }

   public static void main(String[] args) {
        Dog Labrador = new Dog();

        Labrador.Gaw(1, "1");
        Labrador.Gaw("1", 1);
   }
}
