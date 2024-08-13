package programs;//find programs.Ceiling = Smallest number which is greater or equal to the target

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int[] darr = {18,16,14,9,5,3,2};

        int target = 15;

        int ans = findCeil(arr, target);

        System.out.println(ans);
    }

    static int findCeil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //for Checking Sorted Arrays order
        boolean isAsc = arr[start] < arr[end];

        //if the target is greater than the greatest number in array
        if(isAsc){
            //for ascending
            if(target > arr[end]){
                return -1;
            }
        }
        else {
            //for descending
            if (target > arr[start]) {
                return -1;
            }
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return arr[mid];
            }

            if(isAsc){ //for ascending array
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{ //for descending array
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            }

        if(isAsc){
            return arr[start];
        }
        else {
            return arr[end];
        }

        }


}
