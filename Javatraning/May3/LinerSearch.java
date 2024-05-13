package Javatraning.May3;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array");
        int i;
        for ( i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int item = sc.nextInt();
        int c= 0; //flag
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                c++;
                System.out.println("Element is found at :" + i);
                break;
            }

        }
        if(c==0)
        {
           System.out.println("Element not found");
        }

    }
}
