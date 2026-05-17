/*
Topic: Conditionals
Program: If Else Statement

Definition:
if-else is used to execute one block when condition is true and another
block when condition is false.

Approach:
Checking whether a number is even or odd.
*/

package conditionals;
public class B_IfElse {
    public static void main(String[] args) {
        int number = 7;
        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
