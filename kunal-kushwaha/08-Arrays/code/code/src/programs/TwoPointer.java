package programs;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println("+++ Two Pointer +++");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array:" + Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println("Swaped Array:" + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After Two pointer Reversed Array:" + Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = 0;
        temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
