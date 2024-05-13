package ArrayList_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {
    public static void main(String[] args) {
        List <String> mylist = new ArrayList<>();
        mylist.add("Red");
        mylist.add("Green");
        mylist.add("Blue");
        mylist.add("Yellow");

        System.out.println(mylist);

        mylist.set(2, "Pink");
        mylist.remove(3);
        System.out.println(mylist);
    }
}
