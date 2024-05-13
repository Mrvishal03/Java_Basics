package ArrayList_HomeWork;

import java.util.ArrayList;

public class EmptyList {
     public static void main(String[] args) {
          ArrayList<String> mylist= new ArrayList<String>();
          mylist.add("Red");
          mylist.add("Green");
          mylist.add("Black");
          mylist.add("White");
          mylist.add("Pink");
          System.out.println("Original array list: " + mylist);
          mylist.removeAll(mylist);
          System.out.println("Array list after remove all elements "+mylist);   
   }
}

