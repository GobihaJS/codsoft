package number_geussing;

import java.util.Random;
import java.util.Scanner;
public class NumberGeussingGame {
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       Random num = new Random();

	       int maxNumber = 100;
	       int numAttempts = 10;
	       int score = 0;

	       boolean Play_Again = true;
	       while (Play_Again) {
	           int randomNumber = num.nextInt(maxNumber) + 1; // Generate random number between 1 and maxNumber
	           int attemptsTaken = 0;

	           System.out.println("I'm thinking of a number between 1 and " + maxNumber + ". Can you guess it?");

	           while (attemptsTaken < numAttempts) {
	               System.out.print("Enter your guess: ");
	               int Guess_Value = input.nextInt();
	               attemptsTaken++;

	               if (Guess_Value == randomNumber) {
	                   System.out.println("Congratulations! You guessed the number in " + attemptsTaken + " attempts.");
	                   score++;
	                   break;
	               } else if (Guess_Value < randomNumber) {
	                   System.out.println("Too low! Try again.");
	               } else {
	                   System.out.println("Too high! Try again.");
	               }
	           }

	           if (attemptsTaken == numAttempts) {
	               System.out.println("Sorry, you ran out of attempts. The number was " + randomNumber + ".");
	           }

	           System.out.print("Do you want to play again? (yes/no): ");
	           Play_Again = input.next().equalsIgnoreCase("yes");

	           if (Play_Again) {
	               System.out.println("Your current score is: " + score);
	           }
	       }

	       System.out.println("Thanks for playing! Your final score is: " + score);
	   }
}
