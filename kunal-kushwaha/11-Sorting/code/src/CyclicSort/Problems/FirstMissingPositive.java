package CyclicSort.Problems;

import java.util.Arrays;

//41. First Missing Positive https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int ans = findMissingPositive(nums); //3
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    public static int findMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){ //we are ignoring the negatives
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        //Finding The Least Missing Positive Number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return index + 1;
            }
        }

        //Case 2: if all the elements are sorted then the answer would be n+1
        return nums.length + 1;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
