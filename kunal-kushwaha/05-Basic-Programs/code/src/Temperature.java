import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Degree: ");
       float degree = input.nextFloat();

       float fahrenheit = (degree * 9/5) + 32;

       System.out.println("in Fahrenheit: " + fahrenheit);
    }
}

// while is when we do not know about the number of iteration mostly
// for is when we know