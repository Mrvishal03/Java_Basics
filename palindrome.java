import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int r,sum=0;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
      int n=sc.nextInt();
       int temp=n;
        while (n>0) {
           r=n%10;
           sum=(sum*10)+r;
           n=n/10;
        }
        if (temp==sum) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindropme");
        }

    }
    
}
