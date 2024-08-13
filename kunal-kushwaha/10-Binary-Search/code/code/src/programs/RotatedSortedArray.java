package programs;
//3 10
//33. rotated sorted array https://leetcode.com/problems/search-in-rotated-sorted-array

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //4
        int output = search(nums, target);
        System.out.println(output);

        int[] nums2 = {3,5,1};
        int target2 = 3; // 0
        int output2 = search(nums2, target2);
        System.out.println(output2);

    }
    //search
    static int search(int[] nums, int target){
        //first find pivot
        int pivot = findPivot(nums);

        //if pivot was not found then array is not rotated(we apply normal binary search)
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot was found, then we have 2 ascending sorted arrays and 3 cases
        //case 1: if pivot is equal to the target
        if(nums[pivot] == target){
            return  pivot;
        }
        //case 2: target >= start (comes in first sub array, because all the other numbers
        // are smaller than the start(because of rotated sorted array))
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        //case 3: target < start (comes in second sub array)
        else{
         return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    //finding Pivot{which is the greatest number in the Ascending array}
    //NOTE: Below function is not for the duplicate values
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //4 Cases over Here
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid] <  nums[mid - 1]) {
                return mid - 1;
            }
            // for removing unnecessary search space from the right of the mid including mid
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            // for removing unnecessary search space from the left of the mid including mid
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //Binary search Algo
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

