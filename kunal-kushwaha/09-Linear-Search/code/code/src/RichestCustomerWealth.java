import java.util.Arrays;

// Leetcode: 1672: https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        System.out.println(maximumWealth(accounts));

    }

    static public int maximumWealth(int[][] accounts) {
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                //when you start a new col, take a new sum for that row.
                sum += accounts[person][account];
            }
            //now we have sum of account of person
            //check the overall answer

            if(sum > ans){
                ans = sum;
            }
        }

        return ans;
    }
}
