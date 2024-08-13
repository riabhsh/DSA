import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("+++ Reverse A number +++");

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        int revNumber = 0;

        int temp = 0;

        int counter = 0;

        while(counter < number){
            temp = number % 10;
            revNumber = temp + (revNumber * 10); //32
            number = number / 10;
        }

        System.out.println("Reverse Number is: " + revNumber);
    }
}
