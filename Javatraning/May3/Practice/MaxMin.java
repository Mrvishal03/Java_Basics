package Javatraning.May3.Practice;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        System.out.println("Enter the elements of an array");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(i= 1;i<arr.length;i++){
            if (arr[i]>max)
             {
                max= arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
    }
}
