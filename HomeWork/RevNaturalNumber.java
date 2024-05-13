package HomeWork;

import java.util.Scanner;

public class RevNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an natural number");
        int n= sc.nextInt();
        int i;
        for(i=n;i>=1;i--){
       System.out.println(i);
        }
    }
}
