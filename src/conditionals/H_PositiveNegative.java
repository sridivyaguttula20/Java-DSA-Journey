/*
Topic: Conditionals
Program: Positive or Negative Number

Approach:
Checking whether a number is positive, negative or zero.
*/

package conditionals;
public class H_PositiveNegative {
    public static void main(String[] args) {
        int number = -5;
        if(number > 0) {
            System.out.println("Positive Number");
        } else if(number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }
}