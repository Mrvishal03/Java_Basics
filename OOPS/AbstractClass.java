package OOPS;

//abstract class: Which class have  both defined and undefined function

abstract class dd {
    abstract void fun1();

    void sun() {
        System.out.println("Hello");
    }

}

public class AbstractClass extends dd {
    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        dd obj1 = new AbstractClass();
        obj.fun1();
        obj.sun();

    }

    void fun1() {
        System.out.println("How r u");
    }

}
