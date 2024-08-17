import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5}; //this is already sorted!
        int[] arr3 = {}; //Empty Array
        int[] arr4 = {1}; //Singe Element
        int[] arr5 = {-32, -100, 25, 21 ,0 ,155}; //mix numbers

        System.out.println("++Bubble Sort++\n");

        System.out.println("+ 1. Array is not Sorted+");
        selection(arr);
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("+ 2. Array is Sorted+");
        selection(arr2);
        System.out.println(Arrays.toString(arr2) + "\n");

        System.out.println("+ 3. Array is Empty+");
        selection(arr3);
        System.out.println(Arrays.toString(arr3) + "\n");

        System.out.println("+ 4. Array is Have on one Single Element+");
        selection(arr4);
        System.out.println(Arrays.toString(arr4) + "\n");

        System.out.println("+ 5. Array with Mix Numbers+");
        selection(arr5);
        System.out.println(Arrays.toString(arr5) + "\n");
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return  max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}