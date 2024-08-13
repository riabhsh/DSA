import java.util.Scanner;

public class CharCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+++ UpperCase Lower Case Checker +++");
        char word = input.next().trim().charAt(0);

        if(word >= 'a' && word <= 'z'){
            System.out.println("Lowercase!");
        }
        else if(word >= 'A' || word >= 'Z') {
            System.out.println("Uppercase");
        }
    }
}
