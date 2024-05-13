package OOPS;
//Single memory shared between different object
public class Static {
    int a;
    void fun()
    {
        a =10;

    }

    void show()
    {
         System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 =new Static();
        obj1.fun();
        obj1.show();
        
    }
}
