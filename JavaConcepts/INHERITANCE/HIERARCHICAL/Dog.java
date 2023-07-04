package JavaConcepts.INHERITANCE.HIERARCHICAL;


public class Dog extends Animal {
    void sound() {
        System.out.println("bow--bow");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.animalType();

        Cat c = new Cat();
        c.sound();
    }
}