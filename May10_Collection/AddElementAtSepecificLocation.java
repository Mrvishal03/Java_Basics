package May10_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class AddElementAtSepecificLocation {
    public static void main(String[] args) {
        Integer arr[] = { 11, 22, 33, 44 };
        Vector<Integer> vec = new Vector<>(Arrays.asList(11, 22, 33, 44));
        System.out.println(vec);
        vec.add(1, 99);
        System.out.println(vec);
        vec.add(1, 89);
        System.out.println(vec);

        Vector<Integer> newVec = new Vector<>();
        newVec.addAll(vec);
        System.out.println("New vector");
        System.out.println(newVec);

        System.out.println(newVec.contains(45)); // Searching
        System.out.println(newVec.indexOf(33));

        Collections.sort(newVec);
        System.out.println(newVec);

        Collections.reverse(newVec);
        System.out.println(newVec);

        Collections.sort(newVec, Comparator.reverseOrder()); // Comparator is a interface
        System.out.println(newVec);

    }
}
