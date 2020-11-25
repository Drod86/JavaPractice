import java.util.*;

public class LoopMap {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Array list of integers
		ArrayList<Integer> nums = new ArrayList<Integer>();
		do {
			System.out.println("please enter a number: ");
			nums.add(input.nextInt());
		} while (nums.size() < 5);
		
		int sum = 0;
		int product = 1;
		int largest = 0;
		int smallest = 100;
		
		for (int num : nums){
			sum += num;
			product *= num;
			if (num < smallest) {
				smallest = num;
			}
			if (num > largest){
				largest = num;
			}
		}
		
		System.out.printf("Sum: %s Product: %s Largest: %s Smallest: %s", sum, product, largest, smallest);
		
		//Car Dealer hash map of vehicles
		HashMap<String, String> car = new HashMap<>();
		car.put("civic", "Honda");
		car.put("accord", "Honda");
		car.put("highlander", "Toyota");
		car.put("mirage", "Mitzubishi");
		car.put("outback", "Suburu");
		
		System.out.println("What model car are you interested in?");
		String request = input.next();
		
		if (car.containsKey(request)){
			String make = car.get(request);
			System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", request, make );
		} else {
			System.out.printf("Sorry we don't have any %s.", request );
		}
		
	}
}