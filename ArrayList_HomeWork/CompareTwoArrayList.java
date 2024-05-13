package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        
        ArrayList <String> List1 = new ArrayList<>();
        List1.add("Red");
        List1.add("Green");
        List1.add("Blue");

        ArrayList <String> List2 = new ArrayList<>();
        List2.add("Red");
        List2.add("Blue");
        List2.add("Orange");
        
        ArrayList List3 = new ArrayList<>();
        for (Object e : List1) {
            
            List3.add(List2.contains(e) ? "Yes" : "No");
         
        }
        System.out.println(List3);
    }
}
