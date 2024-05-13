package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        
        List <String> myList = new ArrayList<>();
        myList.add("Red");
        myList.add("Green");
        myList.add("Yellow");
        myList.add("Pink");
        System.out.println("Before sort:");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println("After sort:");
        System.out.println(myList);


    }
    
}
