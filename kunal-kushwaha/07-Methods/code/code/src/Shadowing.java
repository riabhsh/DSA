public class Shadowing {
    static int x = 10; //this will be shadowd(or hidden) at line 9
    public static void main(String[] args) {
        System.out.println(x);

        int x; //shadowing happening when the local variable declares
//        System.out.println(x); //scope will begin when the value is itialized
        x = 100;
        System.out.println(x); // here at line 9 outside x is shadowed by this one



        fn();
    }

    static void fn(){
        System.out.println(x);
    }
}
