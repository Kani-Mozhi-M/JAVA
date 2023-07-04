package JavaConcepts;

public class ConstructorChaining {
    int id, age;
    String name = "";

    public ConstructorChaining(int age) {
        this.age = age;
    }

    public ConstructorChaining(int id, int age) {
        this(age);
        this.id = id;

    }

    public ConstructorChaining(int id, int age, String name) {
        this(id, age);
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorChaining cc = new ConstructorChaining(10, 19);
        System.out.println(" student id " + cc.id + " age is " + cc.age + " " + cc.name);
    }
}
