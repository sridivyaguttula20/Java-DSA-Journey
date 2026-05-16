/*
Topic: Basics
Program: User Input using Scanner

Definition:
Scanner class is used to take input from the user in Java.

Approach:
Using Scanner methods to read different types of inputs.
*/

package basics;
import java.math.BigInteger;
import java.util.Scanner;
public class E_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer Input
        System.out.println("Enter the value for firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is: " + ans);

        // BigInteger Input
        System.out.println("Enter BigInteger value:");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger: " + bg);

        // Boolean Input
        System.out.println("Enter the value for flag:");
        boolean flag = sc.nextBoolean();
        System.out.println("flag is: " + flag);

        // Short Input
        System.out.println("Enter the value for shortVal:");
        short shortVal = sc.nextShort();
        System.out.println("shortVal is: " + shortVal);

        // Float Input
        System.out.println("Enter the value for floatValue:");
        float floatValue = sc.nextFloat();
        System.out.println("floatValue is: " + floatValue);

        sc.close();
    }
}