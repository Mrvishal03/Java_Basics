package Javatraning.May3.Practice;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {11,22,33,44,55,66,77,88,99,100};
        int beg = 0,end=arr.length-1,mid = (beg+end)/2;
        System.out.println("Enter the element to be search");
        int item = sc.nextInt();
        int c=0;
        while (beg<=end) {
            if (item==arr[mid]) {
                c++;
                System.out.println("Element found:"+mid);
                break;
            }
            if (item>arr[mid]) {
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (beg+end)/2;
        }
        if (c==0) {
            System.out.println("item not found");
        }

    }
}
