package programs;

//Mountain array is also known as Bitonic Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element

public class PeakIndexInMountainArray {
    public static void main(String[] args){
        int[] arr = {0, 1, 0};
        int[] arr2 = {0, 2, 1, 0};
        int[] arr3 = {1, 10, 5, 2};
        int[] arr5 = {1,2,3,5,6,4,2,1,0};

        int ans = peakIndexInMountainArray(arr);

        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            // for Clearing Descending
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            // for Clearing Ascending
            else{
                start = mid + 1;
            }
        }

        //when start == end and mid then that are answer(the maximum number or peak value)
        return start;
    }
}


