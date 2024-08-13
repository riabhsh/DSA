import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+++ Calculator +++");

        while(true){
            int ans = 0;
            System.out.print("Enter Operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter First Number: ");
                int num1 = input.nextInt();
                System.out.print("Enter Second Number: ");
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                    System.out.println("addistion: " + ans);
                }

                if(op == '-'){
                    ans = num1 - num2;
                    System.out.println("Subtract: " + ans);
                }

                if(op == '*'){
                    ans = num1 * num2;
                    System.out.println("Multiplication: " + ans);
                }

                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                        System.out.println("Division: " + ans);
                    }
                    else{
                        System.out.println("number 2 is 0");
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                    System.out.println("Modulus: " + ans);
                }
            }

            else if(op == 'E' || op == 'e'){
                System.out.println("Exit...");
                break;
            }
            else{
                System.out.println("Wrong Choice");
            }

        }

    }
}
