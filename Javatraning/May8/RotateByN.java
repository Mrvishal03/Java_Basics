package Javatraning.May8;

public class RotateByN {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27 };
        int n =4;
        arr = Rotation(arr,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }

    private static int[] Rotation(int[] arr, int n) {
        
        while (n>0) {
            int x =arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = x;
            n--;
        }
        return arr;
    }
    
}
