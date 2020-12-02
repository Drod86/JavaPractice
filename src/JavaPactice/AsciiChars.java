package JavaPactice;
import java.util.Scanner;
import java.util.Arrays;

 class FavoritePet {
	String name;
	int age;
}

 class LotteryPlayer {
	FavoritePet favPet = new FavoritePet();
	int luckyNumber;
	int favQBJrsyN;
	int carYear;
	String favActor;
	int randomNum;
}
 
class LotteryGame {
	public static int randomNum(int max) {
		int rando = (int) Math.floor(Math.random()*max) + 1;
		return rando;
	}
	
	public static int lotteryNumber(int rando, LotteryPlayer player, int[] randos, int max) {
		int lotteryNumber = 0;
		switch(rando) {
		case 1:
			lotteryNumber = player.favPet.name.charAt(2);
			break;
		case 2:
			lotteryNumber = player.carYear + player.luckyNumber;
			break;
		case 3:
			lotteryNumber = player.randomNum - randos[(int) Math.floor(Math.random()*3)];
			break;
		case 4:
			lotteryNumber = player.favActor.charAt(0);
			break;
		case 5:
			lotteryNumber = player.favActor.charAt(player.favActor.length() - 1);
			break;
		case 6:
			if (player.favQBJrsyN != 0) {
				lotteryNumber = player.favQBJrsyN + player.favPet.age + player.luckyNumber;
			} else {
				lotteryNumber = 42;
			}
			break;
		case 7:
			lotteryNumber = player.favPet.age + player.carYear;
			break;
		default:
			lotteryNumber = 42;
		}
		
		while (lotteryNumber > max) {
			lotteryNumber -= max;
		}
		
		return lotteryNumber;
	}
	
	public static String lotteryNumbers(LotteryPlayer player) {
		int max = 65;
		int magicMax = 75;
		
		int[] ranNums = new int[3];
		for (int i = 0; i < ranNums.length; i++) {
			ranNums[i] = randomNum(max);
		}
		
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.abs(lotteryNumber(randomNum(7), player, ranNums, max));
			for (int k = 0; k < nums.length; k++) {
				if (nums[i] == nums[k]) {
					nums[i] = Math.abs(lotteryNumber(randomNum(7), player, ranNums, max));
				}
			}
		}
		
		Arrays.sort(nums);
		
		int magic;
		
		if (player.favQBJrsyN != 0) {
			magic = ranNums[(int) Math.floor(Math.random()*3)]*player.favQBJrsyN;
			while (magic > magicMax) {
				magic -= magicMax;
			}
		} else {
			magic = ranNums[(int) Math.floor(Math.random()*3)]*player.luckyNumber;
			while (magic > magicMax) {
				magic -= magicMax;
			}
		}
		return String.format("Lottery numbers: %s, %s, %s, %s, %s  Magic ball: %s", nums[0], nums[1], nums[2], nums[3], nums[4], magic);
	}
}

public class AsciiChars {
	static Scanner input = new Scanner(System.in);
	public static void printNumbers(){
	    for (int i = 49; i >= 49 && i <= 57; i++) {
	    	System.out.println((char)i);
	    }
	}

	public static void printLowerCase(){
		for (int i = 97; i >= 97 && i <= 122; i++) {
	    	System.out.println((char)i);
	    }
	}
	
	public static void printUpperCase(){
		for (int i = 65; i >= 65 && i <= 90; i++) {
	    	System.out.println((char)i);
	    }
	}
	
	public static void newLine() {
		System.out.println();
	}
	
	public static void printAll() {
		printNumbers();
		newLine();
		printLowerCase();
		newLine();
		printUpperCase();
	}
	
	static Integer getIntegerInput(String ask) {
		System.out.println(ask);
		if (input.hasNextInt() == false) {
			input.next();
			System.out.println("Invalid input");
			return getIntegerInput(ask);
		}
		return input.nextInt();
	}

	public static void main(String[] args) {
		// print ASCII values
		printAll();
		
		// Lottery Number Game
		
		boolean yesInterview;
		
		
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.printf("Hello %s. ", name);
		System.out.println("Would you like to continue on to the interview? (y or n)");
		String start = input.nextLine().toLowerCase();
		if (start.equals("yes") || start.equals("y")) {
			yesInterview = true;
			System.out.println("Let's get started.");
		} else {
			yesInterview = false;
			System.out.println("Thanks for stopping by. Please return later to complete the survey.");
		}
		
		while (yesInterview) {
			LotteryPlayer player = new LotteryPlayer();
			System.out.println("What is the name of your favorite pet?");
			player.favPet.name = input.next();
			player.favPet.age = getIntegerInput("What is the age of your favorite pet?");
			player.luckyNumber = getIntegerInput("What is your lucky number?");
			System.out.println("Do you have a favorite quarterback? (y or n)");
			if (input.next().toLowerCase().equals("y")){
				player.favQBJrsyN = getIntegerInput("What is their jersey number?");
			};
			player.carYear = getIntegerInput("What is the two digit model year of your car?");
			System.out.println("What is the first name of your favorite actor or actress?");
			player.favActor = input.next();
			player.randomNum = getIntegerInput("Enter a random number between 1 and 50.");
			
			new LotteryGame();
			System.out.println(LotteryGame.lotteryNumbers(player));
			
			System.out.println("Would you like to play again? (y or n)");
			if (input.next().toLowerCase().equals("y")) {
				System.out.println("Let's play again!");
			} else {
				System.out.println("Thanks for playing. See you next time!");
				yesInterview = false;
			}
		}
		
	}
}

