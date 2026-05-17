/*
Topic: Conditionals
Program: Leap Year Checker

Definition:
A leap year is divisible by 4, but century years must also be divisible by 400.

Approach:
Checking leap year conditions.
*/

package conditionals;
public class J_LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
