package Javatraning.April26;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int rem,arm=0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int   temp = num;
        while (num>0) 
        {
            rem=num%10;
            arm = (rem*rem*rem)+arm;
            num = num/10;
        }
        if (temp==num) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
