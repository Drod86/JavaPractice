package IfElsePractice;
import java.util.*;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Animal sounds
		/*System.out.println("Enter cat or dog.");
		String animal = input.nextLine();
		
		if (animal.equals("cat")) {
			System.out.println("Meow!");
		} else if (animal.equals("dog")) {
			System.out.println("Woof!");
		} else {
			System.out.println("Unkown animal sound!");
		}*/
		
		// Guess a number
		System.out.println("Enter a number between 1 and 100!");
		int guess = Integer.parseInt(input.nextLine());
		int randomnumber = (int) Math.floor(Math.random()*100) + 1;
		
		if (randomnumber == guess) {
			System.out.printf("You guessed it: %s \n", randomnumber);
		} else {
			System.out.printf("Try again %s \n", randomnumber);
		}
		
		// Did I pass?
		/*System.out.println("Enter your grade number value:");
		int grade = Integer.parseInt(input.nextLine());
		
		if (grade >= 60) {
			System.out.println("You pass!");
		} else {
			System.out.println("You will have to take the class again.");
		}*/
	}

}
