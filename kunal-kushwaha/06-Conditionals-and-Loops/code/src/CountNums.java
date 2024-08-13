import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("+++ Find How many times the number is Repeated +++");

        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.print("Enter desired number: ");
        int n = input.nextInt();

        int count = 0;

        int temp = 0;

        while(num > 0){
            temp = num % 10;
            if(temp == n){
                count++;
            }
            num = num / 10;
        }

        System.out.println("total times: " + count);
    }
}
