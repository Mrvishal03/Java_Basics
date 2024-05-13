package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class InsertAt1st {
    public static void main(String[] args) {
                List<String> list_Strings = new ArrayList<String>();
 list_Strings.add("Red");
 list_Strings.add("Green");
 list_Strings.add("Blue");
System.out.println(list_Strings);

list_Strings.add(0,"Pink");
list_Strings.add(4,"Yello");
System.out.println(list_Strings);
        
    }
}
