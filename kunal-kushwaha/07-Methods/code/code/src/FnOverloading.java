import java.util.Arrays;

public class FnOverloading {
    public static void main(String[] args) {
    fn(21);
    fn("Rishabh");
    fn(21, 23);
    fn(21, "rishabh");

    varLengthArgs(21,21,21,21,2,2,12);
    varLengthArgs("a", "b", "c", "d", "e");
    }

    static void fn(int a){
        System.out.println(a);
    }

    static void fn(String a){
        System.out.println(a);
    }

    static void fn(int a, String d){
        System.out.println(a + " " + d);
    }

    static void fn(int a, int b){
        System.out.println(a + " " + b);
    }

    static void varLengthArgs(int ...x){
        System.out.println(Arrays.toString(x));
    }

    static void varLengthArgs(String ...x){
        System.out.println(Arrays.toString(x));
    }


}

