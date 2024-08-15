package BinarySearch2DArrays;

//Search in Sorted Matrix

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
            int [][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int target = 9;

        System.out.println(Arrays.toString(search(arr, target)));
    }

//    search in the rows provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                 cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //Be Cautious Matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, rows, 0, cols-1, target);
        }

        // we do this with row-wise it can also be performed col-wise.
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)){//while this is true it will have more then 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        //now we have 2 rows
        //check whether the target is in the col of 2 rows

        //Checking for start
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        //Checking for end
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return  binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // search in 4th half
            return binarySearch(matrix, rStart + 1, cMid + 1, cols -1, target);
    }
}
