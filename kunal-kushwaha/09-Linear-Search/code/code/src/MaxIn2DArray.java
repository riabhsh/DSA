public class MaxIn2DArray {
    public static void main(String[] args) {
        System.out.println("+++ Linear Search(Max in 2D Array) +++");

        int[][] arr = {
                {54, 56 ,59, 84},
                {45, 2600, 67, 91},
                {14, 41, 79, 32},
                {75, 672, 745, 12}
        };

        int ans = max2Array(arr);

        System.out.println(ans);
    }

    static int max2Array(int[][] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;;
//        for(int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                if(arr[i][j] > max){
//                    max = arr[i][j];
//                }
//                if(arr[i][j] == arr[i].length){
//                    return max;
//                }
//            }
//        }

        //FOR EACH METHOD
        for(int[] i : arr){
            for(int j : i){
                if(j > max){
                    max = j;
                }
                if(j == arr.length){
                    return max;
                }
            }
        }

        return max;
    }
}
