package Javatraning.May3.Practice;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int arr[] = {2,5,46,8,7,5,35,5,85,64,4};
        Arrays.sort(arr); 
        System.out.println("After sorted");
        int i, count=1;
        for(i=0;i<arr.length-1;i++)
        {
            if (arr[i]==arr[i+1]) {
                count++;
            }
            if (arr[i]!=arr[i+1])
             {
                System.out.println(arr[i]+ ":"+count);
                count=1;
            }

        }
        System.out.println(arr[i] +":" +count);
        
    }
    
}
