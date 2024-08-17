import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5}; //this is already sorted!
        int[] arr3 = {}; //Empty Array
        int[] arr4 = {1}; //Singe Element
        int[] arr5 = {-32, -100, 25, 21 ,0 ,155}; //mix numbers

        System.out.println("++Insertion Sort++\n");

        System.out.println("+ 1. Array is not Sorted+");
        insertion(arr);
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("+ 2. Array is Sorted+");
        insertion(arr2);
        System.out.println(Arrays.toString(arr2) + "\n");

        System.out.println("+ 3. Array is Empty+");
        insertion(arr3);
        System.out.println(Arrays.toString(arr3) + "\n");

        System.out.println("+ 4. Array is Have on one Single Element+");
        insertion(arr4);
        System.out.println(Arrays.toString(arr4) + "\n");

        System.out.println("+ 5. Array with Mix Numbers+");
        insertion(arr5);
        System.out.println(Arrays.toString(arr5) + "\n");
    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            //j > 0, j <= i - 2(i is length of array), and j is starting as i + 1
            for (int j = i + 1; j > 0 ; j--) { //reverse loop
                if(arr[j] < arr[j - 1]){
                    swap(arr, j ,j - 1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
