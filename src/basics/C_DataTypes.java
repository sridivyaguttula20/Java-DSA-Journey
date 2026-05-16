/*
Topic: Basics
Program: Data Types in Java

Definition:
Data types specify the type of data a variable can store.

Types of Data Types:
--> Primitive Data Types
1. Numeric Data Types
   - byte
   - short
   - int
   - long
2. Floating Data Types
   - float
   - double
3. Other Data Types
   - char
   - boolean
--> Non-Primitive Data Types
   - String
   - Arrays
   - Classes
   - Objects
Approach:
Declaring variables using different
data types and printing them.
*/

package basics;
public class C_DataTypes {
    public static void main(String[] args) {

        // Numeric Data Types
        byte num1 = 127;
        System.out.println("Byte: "+ num1);

        short num2 = 32767;
        System.out.println("Short: "+ num2);

        int num3 = 50000;
        System.out.println("Integer: "+ num3);

        long num4 = 329421370L;
        System.out.println("Long: "+ num4);

        // Floating Data Types
        float num5 = 3.142436f;
        System.out.println("Float: "+ num5);

        double num6 = 3.142435464777779;
        System.out.println("Double: "+ num6);

        // Boolean Type
        boolean eligibleToVote = true;
        System.out.println("Boolean: "+ eligibleToVote);

        // Character Type
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // String Type
        String name = "Divya";
        System.out.println("Name: " + name);
    }
}