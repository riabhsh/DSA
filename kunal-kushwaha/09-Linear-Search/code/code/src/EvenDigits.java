import java.util.Arrays;
//Leetcode : 1295: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 345, 2, 6, 7896, 10, 12};
        System.out.println(Arrays.toString(nums));

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even2(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int count = 0;

        if(num < 0){
            num = num * -1;
        }

        while(num > 0){
            num = num / 10;
            count++;
        }

        return count % 2 == 0;
    }

    static boolean even2(int num){
        if(num < 0){
            num = num * -1;
        }

        //Different way of counting number of digits
        int count = (int)(Math.log10(num))+1;

        return count % 2 == 0;
    }

}
