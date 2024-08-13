//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

package programs;

public class InfiniteArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,54,87,90,100,200,300};
        int target = 300;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target){

        //first find the range
        //first start with a box of size of 2
        int start = 0;
        int end = 1;

        //Condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            int sizeofBox = end - start + 1;
            //double the box value
            //end = previous end + sizeofbox * 2

            end = end + sizeofBox * 2;
            if (end < arr.length - 1) { //we are doing this for preventing array out of bound problem
                end = end + sizeofBox * 2;
            }else {
                end = arr.length - 1;
            }
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return ans = mid;
            }
        }
        return ans;
    }
}
