package HomeWork;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter base number:");
      int num = sc.nextInt();
      System.out.println("Enter Exponent");
      int e=sc.nextInt();
      int pow=1;
      for(int i=e;i>=1;i--)
      {
            pow=pow*num;
      }  
      System.out.println(pow);
    }
}
