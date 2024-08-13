import java.util.Arrays;

public class SearchINRange {
    public static void main(String[] args) {
        System.out.println("+++ Linear Search (Search in Range) +++");
        int[] arr = {54, 65, 85, 75, 55, -65, 74, 32, 11};
        System.out.println(Arrays.toString(arr));

        int ans = LinearSearchRange(arr, 75, 3, 5);
        System.out.println(ans);
    }

    static int LinearSearchRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; start <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }

        return 1;
    }
}
