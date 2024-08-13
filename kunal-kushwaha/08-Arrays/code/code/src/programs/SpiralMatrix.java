package programs;

//https://leetcode.com/problems/spiral-matrix/

//https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/SpiralMatrix.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println(" ");

        List<Integer> arr = spiralOrder(matrix);

        System.out.println(arr);

    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if(matrix.length == 0){
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            //traverse Right
            for(int n = colBegin; n <= colEnd; n++){
                res.add(matrix[rowBegin][n]);
            }
            rowBegin++;

            //traverse bottom
            for(int m = rowBegin; m <= rowEnd; m++){
                res.add(matrix[m][colEnd]);
            }

            colEnd--;

            if (rowBegin <= rowEnd) {
                //traverse left
                for (int n = colEnd; n >= colBegin; n--){
                    res.add(matrix[rowEnd][n]);
                }
            }

            rowEnd--;

            if (colBegin <= colEnd) {
                //traverse top
                for (int m = rowEnd; m >= rowBegin; m--) {
                    res.add(matrix[m][colBegin]);
                }
            }

            colBegin++;
        }

        return res;
    }

}