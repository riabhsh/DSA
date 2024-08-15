package programs;
//leetcode 410. https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2; //ans is 18
        int ans = splitArray(nums, m);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int m){
        if(m > nums.length){
            return -1;
        }

        int start = maxValueOfArray(nums);
        int end = sumOfArrayElements(nums);

        //binary search
        while (start < end){
            //try for the middle as potential answer
            int mid = start + (end - start) / 2;

            //Calculate how many pieces you can divide this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you can not add this in sub-array, make new sub-array
                    // say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return start; //here start == end == mid
    }

    static int maxValueOfArray(int[] nums) {
        int maxValue = 0;
//    for(int i = 0; i < nums.length - 1; i++){
//        if(nums[i] > nums[i+1]){
//            maxValue = nums[i];
//        }
//        else{
//            maxValue = nums[i+1];
//        }
//    }

        for(int i = 0; i < nums.length; i++){
            maxValue = Math.max(maxValue, nums[i]);
        }
    return maxValue;
    }

    static int sumOfArrayElements(int[] nums) {
        int sumValue = 0;
        for(int i = 0; i < nums.length; i++){
//            sumValue = nums[i] + sumValue;
            sumValue += nums[i];
        }


        return sumValue;
    }

}

