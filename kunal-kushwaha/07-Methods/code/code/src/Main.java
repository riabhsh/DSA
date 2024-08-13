import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        sum();

        int result = sumReturn();
        System.out.println("Result: " + result);
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("sum: " + sum);
    }

    //sum with return type integer
    static int sumReturn(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        return sum;
    }
}



