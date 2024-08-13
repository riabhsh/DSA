import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
//
//        arr[3][3] = 9;

//        System.out.println(arr[3][3]);

        //input via loop
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

//        arr[3][3] = 54;

//        output via loop (1st method)
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

//        output via loop (2nd method)
//          for(int i = 0; i < arr.length; i++){
//              System.out.println(Arrays.toString(arr[i]));
//          }

//        For each method
          for(int[] i : arr){
              System.out.println(Arrays.toString(i));
          }





    }
}
