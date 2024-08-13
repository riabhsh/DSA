package programs;

//go to rotated sorted array this the continuation of that

//Pivot is the largest number in the rotated sorted array
public class FindPivotWithDuplicates {
    public static void main(String[] args) {
        int[] nums2 = {2,9,2,2,2};
        int[] nums = {5,5,6,1,5,5,5,5,5};
        int output = pivotDuplicate(nums);
        System.out.println(output);
    }

    static int pivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if elements of start, mid, end are equal then skip the duplicate
            if(arr[start] == arr[mid] && arr[mid] == arr[start]){
                //NOTE: what if the element of start and end are the pivot
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

