import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        System.out.println("+++ Linear Search +++");
        int[] arr = {54, 65, 85, 75, 55, -65, 74, 32, 11};
        System.out.println(Arrays.toString(arr));

        int ans = LinearSearch(arr, 9);
        System.out.println(ans);

        int ans2 = LinearSearch2(arr, 32);
        System.out.println(ans2);

        Boolean ans3 = LinearSearch3(arr, 32);
        System.out.println(ans3);
    }

    //1. Search in the Array: return the index if item found
    //otherwise item not found return -1
    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int index = 0, end = arr.length;

        while(index < end){
            int element = arr[index];
            if(element == target){
                return index;
            }
            index++;
        }

        //This line will execute if none of the above statement being executed
        //Hence the target not found
        return -1;
    }

    //2. Search the target and return the element.
    static int LinearSearch2(int[] arr, int target){
        if(arr.length == 0){
            //because -1 might be an element
            return Integer.MAX_VALUE;
        }

        // WHILE METHOD
//        int index = 0, end = arr.length;
//        while(index < end){
//            int element = arr[index];
//            if(element == target){
//                return element;
//            }
//            index++;
//        }

        //FOR METHOD
//        for(int index = 0; index < arr.length; index++){
//            int element = arr[index];
//            if(element == target){
//                return element;
//            }
//        }

        //FOR EACH METHOD
        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        //This line will execute if none of the above statement being executed
        //Hence the target not found
        //because -1 might be an element
        return Integer.MAX_VALUE;
    }

    //3. Search the target and return the True or False.
    static boolean LinearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        int index = 0, end = arr.length;

        while(index < end){
            int element = arr[index];
            if(element == target){
                return true;
            }
            index++;
        }

        //This line will execute if none of the above statement being executed
        //Hence the target not found
        return false;
    }
}
