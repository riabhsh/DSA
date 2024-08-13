package programs;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));

        System.out.println(maxRange(arr, 2, 4));
    }

    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }

        int max_item = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(max_item < arr[i]){
                max_item = arr[i];
            }
        }

        return max_item;

    }

    static int maxRange(int[] arr, int start, int end){

        //edge Cases
        if (arr.length == 0){
            return -1;
        }

        if(end < start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int max_item = arr[0];

        for (int i = start; i <= end; i++){
            if(max_item < arr[i]){
                max_item = arr[i];
            }
        }

        return max_item;
    }

}
