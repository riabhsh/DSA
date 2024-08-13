import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int[] arr = new int[5];
            arr[0] = 2;
            arr[1] = 5;
            arr[2] = 56;
            arr[3] = 54;
            arr[4] = 64;

//        System.out.println(Arrays.toString(arr));

//        //Input Using For Loop
//        for (int i = 0; i < arr.length; i++){
//                arr[i] = in.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        //For Each loop
//        for(int i : arr){ //For Every Element in array, Print the element
//            System.out.print(i + " "); //Here i represents element of the array
//        }

//        System.out.println(arr[10]); //index out of bond Error

//        array of Objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        //      Modify
        str[2] = "Rishabh";

        System.out.println(Arrays.toString(str));


    }
}
