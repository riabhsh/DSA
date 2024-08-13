import java.util.Arrays;

public class VarLengArgs {
    public static void main(String[] args) {
    fun(12,21,54,54,54,54,54,54);

    multiple(21,21,"a", "b", "c");

    }

    static void fun(int ...v){ //Variable Length Arguments
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...str){
        System.out.println(a + " " + b + " " + Arrays.toString(str));
    }
}
