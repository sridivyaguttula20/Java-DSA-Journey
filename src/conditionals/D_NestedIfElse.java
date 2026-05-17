/*
Topic: Conditionals
Program: Nested If Else in Java

Definition:
A nested if statement means placing an if statement inside another if statement.

Approach:
First checks the gender, then checks the age using nested if-else conditions
*/

package conditionals;
public class D_NestedIfElse {
    public static void main(String[] args) {
        int age = 19;
        char gender = 'M';
        if (gender == 'M') {
            // If true, execute this block and ignore the else block
            System.out.println("You are a male");
            if (age > 18) {
                // If false, ignore this and execute the else block
                System.out.println("You are male and age > 18");
            }
            else {
                System.out.println("You are male and age <= 18");
            }
        }
        else {
            System.out.println("you are not a male");
            if (age > 18) {
                System.out.println("You are not a male and age > 18");
            }
            else {
                System.out.println("You are not a male and age <= 18");
            }
        }
    }
}