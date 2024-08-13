package programs;

//Q. Find the rotation count in Rotated Sorted Array

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int count = pivotCount(arr);
        System.out.println(count);
    }

    //Pivot Count
    static int pivotCount(int[] arr){
        int pivot = findPivot(arr);

//        if(pivot == -1){
//            return 0;
//        }

        //if pivot is -1 than it cancels out each other and it returns 0 for non-rotated array
        return pivot + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
