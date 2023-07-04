package JavaConcepts.INHERITANCE;

public class ChildClass extends ParentClass {
    int b = 20;

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        System.out.println("parent class value :" + cc.a);
        System.out.println("child class value :" + cc.b);
    }
}
