/*
Topic: Conditionals
Program: Ternary Operator in Java

Definition:
The ternary operator is a shortcut for if-else statement.

Syntax:
condition ? trueStatement : falseStatement;

Approach:
Checking whether a number is even or odd.
*/

package conditionals;
public class E_TernaryOperator {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(result);
    }
}
