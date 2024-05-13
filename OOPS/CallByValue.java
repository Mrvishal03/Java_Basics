package OOPS;

import Javatraning.April25.factorial;

public class CallByValue {

    int fun(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int i;
        CallByValue obj = new CallByValue();
        int sum = 0;
        for (i = 1; i <= 5; i++) {
            int ans = obj.fun(i);
            System.out.println("Factorial of " + i + " is " + ans);
            sum = sum + ans;
        }

        System.out.println("sum is:" + sum);
    }
}
