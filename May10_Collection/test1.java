package May10_Collection;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
 
        Vector<Integer> obj = new Vector<>();
        obj.add(20);
        // obj.add(2.3);
        // obj.add("Hello");
        System.out.println(obj);

        Vector<String> vec = new Vector<>();
        vec.addElement("Vishal");
        vec.addElement("Rajat");
        vec.addElement("Akash");
        vec.addElement("Uday");
        System.out.println(vec);

        System.out.println();

      System.out.println("Using Lemda Function");
        new Vector<>(Arrays.asList(1,2,3)).forEach((k)->System.out.println(k));

        System.out.println();

        System.out.println("Using method reference");
        new Vector<>(Arrays.asList(5,6,7)).forEach (System.out::println);





//Print using for loop
System.out.println();


System.out.println("Using Loop");            //ForLoop
        for (int i = 0; i <vec.size(); i++) {
            System.out.println(vec.get(i));
        }
        System.out.println();


        System.out.println("Using ForEachLoop");  

        for (String x : vec) {         //ForEach Loop
            System.out.println(x);
        }

        System.out.println();
          System.out.println("Using Enumeration");

        Enumeration mynum = vec.elements();
        while (mynum.hasMoreElements()) {
            
            System.out.println(mynum.nextElement());
        }

    }
}
