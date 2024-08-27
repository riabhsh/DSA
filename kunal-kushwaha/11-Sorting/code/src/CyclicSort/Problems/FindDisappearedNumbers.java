//448. Find All numbers Disappeared in Arrays https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package CyclicSort.Problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }
            else{
                i++;
            }
        }

        List<Integer> output = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                output.add(index + 1);
            }
        }
        return output;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
