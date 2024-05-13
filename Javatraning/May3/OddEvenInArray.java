package Javatraning.May3;

public class OddEvenInArray {
    public static void main(String[] args) {

        //Bifircation

        int arr[]= {9,3,7,6,5,2};
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];

        int i, m=0,n=0;

        for(i=0;i<arr.length;i++)
        {
            if (arr[i]%2==0) 
            {
             even[m]=arr[i];
             m++;

            } 
            else 
            {
                odd[n]=arr[i];
                n++;
            }
        }
        System.out.println("Odds");
        for( i=0;i<n;i++)
        {
            System.out.print(odd[i]+" ");
        }

        System.out.println("\nEven");
        for( i=0;i<m;i++)
        {
            System.out.print(even[i]+" ");
        }


        
    }
}
