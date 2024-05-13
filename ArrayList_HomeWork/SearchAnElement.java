package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class SearchAnElement {
    public static void main(String[] args) {
        
        List <String> myList = new ArrayList<>();
        myList.add("Red");
        myList.add("Green");
        myList.add("Yellow");
        myList.add("Pink");
        if (myList.contains("Red")) {
            System.out.println("Item found:");
        } else {
            System.out.println("Item Not found");
        }
        System.out.println(myList); 
    }
}
