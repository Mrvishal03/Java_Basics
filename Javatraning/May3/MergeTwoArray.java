package Javatraning.May3;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[] = {4,8,2,6,8};
        int arr2[] = {1,5,9};
        int arr3[]= new int[arr1.length+arr2.length];
        int i;
        for(i=0;i<arr1.length;i++)
        {
              arr3[i]= arr1[i];
        }

        for(i=0;i<arr2.length;i++)
        {
          arr3[arr1.length+i]= arr2[i];
        }
        System.out.println("After insertion");

        for(i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }


    }
}
