package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Iterate_Elements {
    public static void main(String[] args) {
        
         List<String> list_Strings = new ArrayList<String>();
 list_Strings.add("Red");
 list_Strings.add("Green");
 list_Strings.add("Blue");

 for (String elements : list_Strings) {
    System.out.println(elements);
 }
    }
}
