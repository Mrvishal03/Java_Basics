package Javatraning.May6;

import java.util.Arrays;

public class FindUniqueElement {
    public static void main(String[] args) 
    {
       int a[] = {2,5,3,6,2,4,3,5,9};
        Arrays.sort(a);
        int count=1;
        int i;
        for( i=0 ; i<a.length-1;i++){
            if (a[i]==a[i+1])
             {
                 count++;                           
            }   
            if (a[i]!=a[i+1]) 
            {
                System.out.println(a[i]+ " comes:" +count+ " times");
                  count=1;   
            }

        }
        System.out.println(a[i]+ " comes:" +count + " times");
    }
}
    

