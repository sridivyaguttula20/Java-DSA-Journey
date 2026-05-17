/*
Topic: Conditionals
Program: Largest of Three Numbers

Approach:
Comparing three numbers using if-else conditions.
*/

package conditionals;
public class I_LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;
        if(a > b && a > c) {
            System.out.println("Largest Number: " + a);
        } else if(b > a && b > c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}
