import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        System.out.println("+++ Linear Search (Find Minimum in Array)+++");
        int[] arr = {54, -10, 30, 75, 51, -6, -7000, 32, 11};
        System.out.println(Arrays.toString(arr));

        int ans = min(arr);
        System.out.println(ans);
    }

    //FInd Minimum in Array
    static int min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int ans = arr[i];
            if(ans < min){
                min = ans;
            }
            if(i == arr.length-1){
                return min;
            }
        }

        return Integer.MAX_VALUE;
    }

}


