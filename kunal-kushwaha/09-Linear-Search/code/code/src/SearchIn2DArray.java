import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        System.out.println("+++ Linear Search(Search in 2D Array) +++");
        int[][] arr = {
                {54, 56 ,59, 84},
                {45, 26, 67, 91},
                {14, 41, 79, 32},
                {75, 672, 745, 12}
        };

        int target = 745;
        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    //that below function returning an array(row and col index)
    static int[] search(int[][] arr, int target){

        if(arr.length == 0){
            return new int[]{-1, -1};
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j}; //because we havent initialize the array.. new int[]
                }
            }
        }

        return new int[]{-1, -1};
    }

}
