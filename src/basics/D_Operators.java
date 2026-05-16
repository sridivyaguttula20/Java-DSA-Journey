/*
Topic: Basics
Program: Operators in Java

Definition:
Operators are special symbols used to perform operations on variables and values.

Types of Operators:
1. Arithmetic Operators
2. Assignment Operators
3. Relational Operators
4. Logical Operators
5. Unary Operators
6. Bitwise Operators
7. Ternary Operator

Approach:
Using different operators with examples and printing the results.
*/

package basics;
public class D_Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 20;
        int b = 10;
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        // Assignment Operators
        int marks = 50;
        marks += 10;
        System.out.println("\nAssignment Operator");
        System.out.println("Updated Marks: " + marks);

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        // Logical Operators
        boolean isJavaFun = true;
        boolean completedDSA = false;
        System.out.println("\nLogical Operators");
        System.out.println(isJavaFun && completedDSA);
        System.out.println(isJavaFun || completedDSA);
        System.out.println(!completedDSA);

        // Unary Operators
        int number = 5;
        System.out.println("\nUnary Operators");
        System.out.println(++number);
        System.out.println(number++);

        // Bitwise Operators
        int x = 6;
        int y = 3;
        System.out.println("\nBitwise Operators");
        System.out.println(x & y);
        System.out.println(x | y);

        // Ternary Operator
        int solvedProblems = 320;
        String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";
        System.out.println("\nTernary Operator");
        System.out.println(level);
    }
}