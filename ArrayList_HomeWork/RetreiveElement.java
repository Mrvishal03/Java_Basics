package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class RetreiveElement {
    public static void main(String[] args) {
        
        List <String> list_element = new ArrayList<>();
        list_element.add("Red");
        list_element.add("Blue");
        list_element.add("Green");
        list_element.add("Yello");
        System.out.println(list_element);

        String element = list_element.get(0);
        System.out.println("First Element:" + element);

        element = list_element.get(2);
        System.out.println("Third Element:" +element);
    
    }
}
