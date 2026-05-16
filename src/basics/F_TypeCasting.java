/*
Topic: Basics
Program: Type Casting in Java

Definition:
Type casting is the process of converting one data type into another data type.

Types of Type Casting:
1. Implicit Type Casting (Widening)
2. Explicit Type Casting (Narrowing)

Approach:
Converting values between different data types and printing the results.
*/

package basics;
public class F_TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting
        int num1 = 10;
        double value1 = num1;
        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + num1);
        System.out.println("Converted Double value: " + value1);

        // Explicit Type Casting
        double num2 = 99.99;
        int value2 = (int) num2;
        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + num2);
        System.out.println("Converted Integer value: " + value2);

        // Character to Integer
        char letter = 'A';
        int asciiValue = (int) letter;
        System.out.println("\nCharacter to Integer:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII Value: " + asciiValue);
    }
}
