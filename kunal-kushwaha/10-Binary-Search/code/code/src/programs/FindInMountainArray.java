package programs;

//    1095. Find in Mountain Array.
public class FindInMountainArray {
    public static void main(String[] args) {
            int[] arr = {1,2,3,5,6,4,2,1,0};
            int target = 1;
            int peak = peakIndexInMountainArray(arr);
            int ans = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
            System.out.println(ans);

            int[] arr2 = {1,2,3,4,5,3,1};
            int target2 = 3;
            int peak2 = peakIndexInMountainArray(arr);
            int ans2 = orderAgnosticBS(arr, target2, 0, peak);
            System.out.println(ans2);
    }

// Peak of the mountain Array
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            //for descending
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            //for ascending
            else
                start = mid + 1;
        }
        return start;
    }


// Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[end] > arr[start];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            } else if (isAsc) {
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }


//    1095. Find in Mountain Array.
//    static int findInMountainArray(int target, MountainArray mountainArr){
//    }
}
