package Javatraning.May3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("My elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
