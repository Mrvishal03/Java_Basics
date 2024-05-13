package Javatraning.May8;

public class PairSum {
    public static void main(String[] args) {
        int arr[]= { 6, 8, 4, -5, 7, 9 };
        int sum=15;
     printpair(arr,sum);    
    }
    private static void printpair(int[]arr,int sum){
        for (int i = 0; i < arr.length-1; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i]+arr[j]==sum) {
                    System.out.println(arr[i] +" " + arr[j]);
                }
            }
        }
    }

}
