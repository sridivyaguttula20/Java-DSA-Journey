/*
Topic: Conditionals
Program: If Else If Ladder in Java

Definition:
The if-else-if ladder is used to check multiple conditions one by one.
If one condition becomes true,its block executes and the remaining conditions are skipped.

Approach:
Checking student grade based on marks.
*/

package conditionals;
public class C_If_Else_IfLadder {
    public static void main(String[] args) {
        int marks = 85;
        if(marks >= 90) {
            System.out.println("Grade A");
        } else if(marks >= 75) {
            System.out.println("Grade B");
        } else if(marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
