public class Scope {
    public static void main(String[] args) {
        //Block Scope
        int a = 10;
        System.out.println(a);

        {
            a = 20;
            int b = 30;
            System.out.println(b);
        }
        System.out.println(a);
    //................

        //Functiom Scope
        int m = 32;
        fnScope(m);
        System.out.println(m);
    }

    static void fnScope(int marks){
        marks = 30;
        System.out.println(marks);
    }
}
