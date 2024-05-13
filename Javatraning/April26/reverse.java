package Javatraning.April26;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num,r,sum=0;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         int temp = num;
        while (num>0) {
            r=num%10;  //last digit
            sum = sum*10+r;
            num=num/10; 
        }
        System.out.println(sum);
         
        if(temp==sum)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        




    }
}
