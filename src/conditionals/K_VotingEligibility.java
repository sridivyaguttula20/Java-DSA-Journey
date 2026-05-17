/*
Topic: Conditionals
Program: Voting Eligibility

Approach:
Checking whether a person is eligible to vote.
*/

package conditionals;
public class K_VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}