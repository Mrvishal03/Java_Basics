package Javatraning.May3.Practice;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int i,j;
        for ( i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1;j++)
            {
               if (arr[j]==arr[j+1]) 
               {
                  int temp = arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
            }
        }
        System.out.println("After Swapping:");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
