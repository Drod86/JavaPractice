import java.util.*;
class DataStructPart2 {
	//1. array sumation method
	public static double arraySum(double[] arr){
		double sum = 0;
		for (int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	//2. test given code
	public static void testCode(){
		double[ ] exampleArray = {1,5,6,5,4,1};
		double maximum = exampleArray[0];
		int index = 0;
		for (int i = 1; i<exampleArray.length; i++){
			if (exampleArray[ i ] > maximum) {
				maximum = exampleArray[ i ];
				index = i;
			}
		}
		System.out.printf("2. %s\n", index);
	}
	
	//3. toPower method
	public static double[] toPower(int size, int power){
		double[] arr = new double[size];
		for (int i = 0; i < arr.length; i++){
			arr[i] = Math.pow(i, power);	
		}
		String test = Arrays.toString(arr);
		System.out.printf("3. %s\n", test);
		return arr; 
	}
	public static void main(String[] args){
		double[] nums = {2,4,7,8,2,5};
		double sum = arraySum(nums);
		System.out.printf("1. %s\n", sum);
		testCode();
		toPower(5, 2);
	}
}