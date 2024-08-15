package BinarySearch2DArrays;

//Matrix is Sorted in row-wise and col-wise Manner

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = { //M x N matrix
                            {1, 2},
                            {4, 5},
                            {7, 8}
        };

        int[][] matrix2 = { // N x N matrix
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }

        int target = 37;

        int[] ans = search(matrix2, target);
        System.out.println("Target: " + target + " " + Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        //for m x n matrix you have to give c = (number of column length)

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }

            if(matrix[r][c] < target){
                r++;
            }

            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
