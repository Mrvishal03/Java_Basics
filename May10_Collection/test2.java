package May10_Collection;

import java.util.Scanner;
import java.util.Vector;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer> vec = new Vector<>();
        System.out.println("Enter the number:");
        int i;
        for(i=0;i<5;i++)
        {
            vec.add(sc.nextInt());

        }
        System.out.println("Elements are:");
        System.out.println(vec);

        System.out.println("Enter another element:");
        vec.add(sc.nextInt());
        System.out.println(vec);
      
        System.out.println(  vec.indexOf(99));



    }
}
