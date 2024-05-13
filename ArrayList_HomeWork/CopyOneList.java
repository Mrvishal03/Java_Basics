package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOneList {
    public static void main(String[] args) {
        
        List <String> List1 = new ArrayList<>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
      
        System.out.println("List1" + List1);

        List <String> List2 = new ArrayList<>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
       
       

        System.out.println("List2:"+List2);


        Collections.copy(List1, List2);
        System.out.println("List1:" +List1);
        System.out.println("List2:" +List2);

    }
}
