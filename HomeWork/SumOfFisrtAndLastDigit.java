package HomeWork;

import java.util.Scanner;

public class SumOfFisrtAndLastDigit {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
         
        int firstDigit = 0;
        int lastDigit = 0;
        
        lastDigit = n%10;
        System.out.println("The last digit is"+ lastDigit);

        while (n!=0) 
        {
            firstDigit=n%10;
            n=n/10;

        }
        System.out.println("The first digit is:"+firstDigit);
        int sum=firstDigit+lastDigit;
        System.out.println(sum);
    }

}
