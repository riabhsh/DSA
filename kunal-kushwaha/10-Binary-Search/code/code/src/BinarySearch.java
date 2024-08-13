public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find the middle element

//            int mid = (start + end) / 2;
//            it work in large scale because integer is fixed size.
//            might be possible (start + end) exceeds its range of int in java

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                //element lies on the left hand side
                end = mid - 1;
            } else if(target > arr[mid]){
                //element lies on the right hand side
                start = mid + 1;
            } else{
                //and found
                return mid;
            }
        }

        //when Nothing Found...
        return -1;
    }
}