package OOPS;

class xyz // Grand Parent
{
    void fun1() {
        System.out.println("Hii");
    }
}

class abcd extends xyz // Parent
{
    void fun2() {
        System.out.println("Hello");
    }
}

public class Inheritence extends abcd { // Child
    public static void main(String[] args) {

        Inheritence obj = new Inheritence();
        obj.fun2();
        obj.fun1();

    }

}
