package Javatraning.May6;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 10, 2, 1, 3, 6 };
        int i, j;
        for (i = 0; i < arr.length - 1; i++)// number of steps n-1
        {
            for (j = 0; j < arr.length - 1; j++) // comparision
            {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }

            }
        }

        System.out.println("After Swapping:");

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
