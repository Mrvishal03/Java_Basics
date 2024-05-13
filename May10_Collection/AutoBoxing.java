package May10_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class AutoBoxing {
    public static void main(String[] args) {
         List <Integer> list = new ArrayList <>();
         list.add(23);
         list.add(25);
         list.add(27);
         System.out.println(list);
         System.out.println("Using Loop");

         for (int i = 0; i <list.size(); i++) {
            
            System.out.println(list.get(i));
         }
         System.out.println("\nfor each");

         for (Integer a : list) {
            System.out.println(a);

            
         }

         System.out.println("\niterator");

         Iterator<Integer> itr = list.listIterator();
         while (itr.hasNext()) {
            
            System.out.println(itr.next());
         }

    }
}
