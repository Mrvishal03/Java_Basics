package Javatraning.April25;

public class factors {
     
    public static void main(String[] args) {
        int num = 28;
        int  count=0;
        for (int i = 1; i <=num; i++) {

            if (num%i==0) {
                count++;
                System.out.println(i);
                
            
            } 
        }
        System.out.println("The factors of the " +num+ " are: " +count);

        if (count==2) {
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is not a prime number");
        }
    }
}
