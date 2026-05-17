/*
Topic: Conditionals
Program: Switch Statement in Java

Definition:
Switch statement is used when multiple conditions depend on a single variable.

Rules:
1. Expression must be int, char, String or enum.
2. Case values must be constants.
3. break stops execution.
4. default block is optional.

Approach:
Printing day name using switch statement.
*/

package conditionals;
public class F_SwitchStatement {
    public static void main(String[] args) {
        int dayNumber = 3;
        switch(dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}