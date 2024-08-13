import java.sql.SQLOutput;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        greet();

        String greet = greetReturn();
        System.out.println(greet);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        String namaste = greetReturnArg(name);
        System.out.println(namaste);
    }

    static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
    }

    // Greet with return type String
    static String greetReturn(){
        String greet = "HEllO WORLD";
        return greet;
    }

    // Greet with return type String and argument
    static String greetReturnArg(String name) {
        String message = "Namaste " + name;

        return message;
    }
}
