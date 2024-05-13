package HomeWork;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i =1;i<=num;i++)
        {
            if (num%i==0)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("The factors of the " + num + " are " + count);
    }
}
