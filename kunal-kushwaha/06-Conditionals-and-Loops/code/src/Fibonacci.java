import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+++ nth Fibonacci +++");

        System.out.print("Enter number: ");

        int number = input.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fibo = 0;

//        For loop method
//        for (int i = 0; i < number-1; i++) {
//            fibo = f1 + f2;
//            f1 = f2;
//            f2 = fibo;
//        }

//        While loop method
        int count = 2;
        while (count <= number) {
            fibo = f1 + f2;
            f1 = f2;
            f2 = fibo;
            count++;
        }

        if(number == 1){
            fibo = 1;
            System.out.println(number + "th Fibonacci Number is: " + fibo);
        }
        else{
            System.out.println(number + "th Fibonacci Number is: " + fibo);
        }

    }
}


