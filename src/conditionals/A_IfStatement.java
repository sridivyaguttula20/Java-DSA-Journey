/*
Topic: Conditionals
Program: If Statement in Java

Definition:
The if statement executes a block of code only when the condition is true.

Syntax:
if(condition) {
    // code
}

Approach:
Checking whether a number is positive.
*/

package conditionals;
public class A_IfStatement {
    public static void main(String[] args) {
        int number = 10;
        if(number > 0) {
            System.out.println("Positive Number");
        }
    }
}