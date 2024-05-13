package OOPS;

import java.util.Scanner;

public class InstanceVariable {   //Class ka variable

     int id;
     String name;
     static String clg="RBU";
     Scanner sc;
     void fun(){
        sc = new Scanner(System.in);
        System.out.println("Enter the Id and name");
        id = sc.nextInt();
        name = sc.next();
        
     }
     void show()

     {
        System.out.println(id+ "\t"+ name);
     }
    public static void main(String[] args) {
      
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 =new InstanceVariable();
        obj1.fun();
        obj2.fun();
        obj1.show();
        obj2.show();

        
    }
}
