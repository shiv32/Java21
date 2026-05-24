
abstract class Animal {

    // abstract method (no implementation)
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    // providing implementation
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal a = new Dog(); // abstraction
        a.sound();  // Bark
        a.sleep();  // Sleeping...
    }
}

