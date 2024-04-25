package Javatraning.April25;

public class prime {
    public static void main(String[] args) {
        int num=13,i,c=0;
        for(i=2;i<=Math.sqrt(num);i++)
        {
            if ( num%i==0) 
            {
                c++;
                System.out.println("Not prime");
                break;
            }
        }
        if (c==0) {
            System.out.println("prime");
        }
    }
    
}
