public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,1212121};
        int [] desArr = {150, 8, 5, 4, 3, 2, 1};
        int target = 1;
        int ans = orderAgnosticBS(desArr, target);
        System.out.println(ans);
    }

    //Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // Find Whetehr the Array is Ascending or not
//        one way of writing this is
//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        } else{
//            isAsc = false;
//        }

//        Other Way of writing this is
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            //For ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            //For descending order
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }


        return -1;
    }

}
