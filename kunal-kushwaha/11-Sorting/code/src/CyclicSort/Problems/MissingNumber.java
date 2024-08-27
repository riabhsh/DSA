package CyclicSort.Problems;
import java.util.Arrays;

//268. Missing Number https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {8,6,5,4,3,2,1,0};
        int ans = missingNumber(arr);// 7
        System.out.println(ans);
    }

    static int missingNumber(int[] nums){
        int i = 0;

        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        //missing numbers? Incorrect Indexes
        //case 1. when N is in the Array
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }

        //case 2. when N is not in the Array
        return nums.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

