import java.util.Objects;
import java.util.Scanner;
public class SwitchCaseProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++ Switch Case Prog +++");

        while(true){
            System.out.print("Enter Fruit: ");
            String fruit = input.next();

            if(fruit.equals("e")){
                break;
            }
            else {
                switch (fruit) {
                    case "mango":
                        System.out.println("mango");
                        break;
                    case "orange":
                        System.out.println("Orange");
                        break;
                    case "grapes":
                        System.out.println("Grapes");
                        break;
                    default:
                        System.out.println("wrong choice");
                }
            }

        }
    }
}
