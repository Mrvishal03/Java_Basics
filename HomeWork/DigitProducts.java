package HomeWork;

public class DigitProducts {
    public static void main(String[] args) {
        int num = 1234;
        int product=1;
        int temp = num;
        while (num>0) {
            int digit= num%10;
            product=product*digit;
            num=num/10;

        }
       
        System.out.println("The product of the digits of "+temp+ " is "+product);
    }
}
