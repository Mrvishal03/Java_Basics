package HomeWork;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.println(i);
        }

    }
}
