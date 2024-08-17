import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5}; //this is already sorted!
        int[] arr3 = {}; //Empty Array
        int[] arr4 = {1}; //Singe Element
        int[] arr5 = {-32, -100, 25, 21 ,0 ,155}; //mix numbers

        System.out.println("++Bubble Sort++\n");

        System.out.println("+ 1. Array is not Sorted+");
        bubble(arr);
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("+ 2. Array is Sorted+");
        bubble(arr2);
        System.out.println(Arrays.toString(arr2) + "\n");

        System.out.println("+ 3. Array is Empty+");
        bubble(arr3);
        System.out.println(Arrays.toString(arr3) + "\n");

        System.out.println("+ 4. Array is Have on one Single Element+");
        bubble(arr4);
        System.out.println(Arrays.toString(arr4) + "\n");

        System.out.println("+ 5. Array with Mix Numbers+");
        bubble(arr5);
        System.out.println(Arrays.toString(arr5) + "\n");
    }

    static void bubble(int[] arr){
        //for preventing unnecessary sort on already sorted array
        boolean swapped;

        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max item will come at the last respective time
            for (int j = 1; j < arr.length - i; j++) { //for (int j = 0; j <= arr.length - i - 1; j++)
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            System.out.print("(n -" + i + ") ");
            if(!swapped){ //!swapped = true
                System.out.println("Already sorted arr!");
                break;
            }
        }
    }
}