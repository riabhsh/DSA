package CyclicSort.Problems;

import java.util.Arrays;

//645. Set Mismatch https://leetcode.com/problems/set-mismatch/

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

//        //my Way
//        int ans[] = new int[2];
//        int v = 0;
//
//        //Search for the missing and the duplicate number
//        for (int index = 0; index < nums.length; index++) {
//            if(nums[index] != index + 1){
//                ans[v] = nums[index];
//                ans[v+1] = index + 1;
//            }
//        }
//        return ans;

//        //Kunals way
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return new int[] {nums[index], index + 1};
            }
        }

        return new int[]{-1,-1};
    }

    static void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
