import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,r,sum=0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
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
