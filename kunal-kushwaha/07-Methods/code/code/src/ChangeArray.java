import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] list){
        list[0] = 909; //if you make to change the object via this ref variable same object will be change
    }
}

