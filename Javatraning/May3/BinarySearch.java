
package Javatraning.May3;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        //Array must be in sorted form

      int arr[]= {11,22,33,44,55,66,77,88};
    //             0  1  2  3  4  5  6  7
        
    int beg = 0, end = arr.length-1,mid = (beg+end)/2;
    System.out.println("Enter the element to search");
    int item = sc.nextInt();
    int c=0;
    while (beg<=end) {
        if (item ==arr[mid]) {
            c++;
            System.out.println("Element found at "+mid);
            break;
        }
         if (item>arr[mid]){
            beg = mid+1;

        }
        else{
             
            end = mid-1;
        }
        mid = (beg+end)/2;
    
    }
    if (c==0) {
        System.out.println("Item not found");
        
    }
    

    }
}


//Q find the prime number in an array
//Q find the number whose digit sum is prime