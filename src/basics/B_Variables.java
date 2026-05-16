/*
Topic: Basics
Program: Variables in Java

Definition:
Variables are containers used to store data values.

Rules:
1) Case Sensitivity [age vs AGE]
2) Starting Character [a, A,_,$]
3) Subsequent Characters [0 to 9,_,$]
4) No Reserved Keywords [class, static etc]
5) Length [no limit, but meaningful names needed]
6) Conventions: camelCase, UpperCase for Constants etc
*/

package basics;
public class B_Variables {
    public static void main(String[] args) {

        // Declaration
        int age;

        // Assignment
        age = 10;
        age = 11; //The memory location stays the same, but the value updates.

        System.out.println("Age: " + age);

        // Initialization
        int totalMarks = 20;

        System.out.println("Total Marks: " + totalMarks);

        // Case Sensitive
        int weight = 88;
        int WEIGHT = 98;

        System.out.println("weight: " + weight);
        System.out.println("WEIGHT: " + WEIGHT);

        // Valid Variable Names
        int marks = 10;
        int MARKS = 11;
        int _marks = 12;
        int $marks = 13;

        // Subsequent Letters
        int height5 = 21;
        int height_love = 33;

        // Long Variable Name
        int helloHiIamdivahowareyou = 101;

        // Camel Case
        int myNameIsDiva = 51;

        // Constants
        final int DAYS_IN_YEAR = 365;
        System.out.println("Days in Year: " + DAYS_IN_YEAR);
    }
}