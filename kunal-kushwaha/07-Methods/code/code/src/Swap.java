import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int n1 = input.nextInt();

        System.out.print("Enter b: ");
        int n2 = input.nextInt();

        swap(n1,n2);

        System.out.println("Main Program: " + n1 + "  " + n2);


    }

    static void swap(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("swap function: " + n1 + "  " + n2);
    }
}
