import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {54, 54, 6, 58, 81};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
        nums[2] = 100;
    }
}
