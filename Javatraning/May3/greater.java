package Javatraning.May3;

import java.util.Arrays;
import java.util.Scanner;

public class greater {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int arr[]= new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
        arr[i]= sc.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for(int i =1; i<arr.length;i++)
    {
           if (arr[i]>max) {
            max =  arr[i];
           }

           if (arr[i]<min) {
            min = arr[i];
           }
    }

    // Arrays.sort(arr);  sort array in assending order

    System.out.println("Maximum:"+max);
    System.out.println("Minimum:"+min);
 }   
}
