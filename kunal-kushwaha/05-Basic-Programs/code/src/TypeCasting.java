import java.util.Scanner;

//TYPE CASTING AND CONVERSION

public class TypeCasting {
    public static void main(String[] args) {
        //TypeCasting: when 'one type of Data' is Assigning to 'another type of Variable' then
        // automatic type conversion will take place if the following conditions are met
        //1. 'Type' should be Compatible. like (int/float/double/byte etc..), (char/string..).
        //2. 'Destination Type' should be 'Greater than' the 'Source Type'(eg: float > int, string > char etc..).
        // above is called Automatic conversion..

        //Type Casting: casting incompatible types for conversion of bigger to smaller type. for eg: float value into the int variable.
        Scanner input = new Scanner(System.in);

        //1. Automatic Casting (Widening Casting)
        float num = 42156;
        System.out.println("Automatic Conversion of 'Int Data' Assigning into 'Float Variable': " + num);

        //2. Type Casting (Narrowing Casting)
        int num2 = (int)452.261f;
        System.out.println("Type Casting of 'Float Data' Assigning into 'Int Variable': " + num2);

        //3. Automatic Type Promotion in Expressions
//        int a = 257;
//        byte b = (byte)a; // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c; //when the byte evaluating java 'automatically promoting' it into Integer because each byte is exceeding its limit.
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2; //incompatible types

//        int number = 'A'; //it converts 'A' into its Ascii value
//        System.out.println(number);

//      JAVA follows UNICODE principle it consists almost everything... all the characters, languages etc..
//      System.out.println("नमस्ते ऋषभ मौर्य");

        //3.1 JAVA Type Promotion Rules
        //1. all the (byte/short/char) values are promoted to integers
        //2. if any one of the operand is 'long' then whole operation is promoted to 'long'
        //and same for the float and double..
        //3. for eg: (int*float) the result becomes float...

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.456f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println((f * b) + (i / c) - (d * s));

    }
}

// while is when we do not know about the number of iteration mostly
// for is when we know
