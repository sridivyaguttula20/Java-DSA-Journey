/*
Topic: Conditionals
Program: Even or Odd Number

Approach:
Using modulus operator to check whether a number is even or odd.
*/

package conditionals;
public class G_EvenOdd {
    public static void main(String[] args) {
        int number = 8;
        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
