package ClassPractice.src.practiceclasses;
import java.lang.String;

public class Calculator{
	
	public Calculator(){}
	
	public int add(int num1, int num2){
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2){
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	public int divide(int num1, int num2){
		return num1 / num2;
	}
	
	public int square(int num){
		return num * num;
	}
}

class MagicCalculator extends Calculator {
	public MagicCalculator(){
	}
	
	public double sqrt(double num){
		return Math.sqrt(num);
	}
	
	public double sin(double num){
		return Math.sin(num);
	}
	
	public double cosine(double num){
		return Math.cos(num);
	}
	
	public double tangent(double num){
		return Math.tan(num);
	}
	
	public long factorial(int n) {
	    if (n <= 2) {
	        return n;
	    }	
	    return n * factorial(n - 1);
	}
	
	public static void main(String[] args){
		MagicCalculator myCalc = new MagicCalculator();
		System.out.println(myCalc.add(5, 9));
		System.out.println(myCalc.factorial(20));
	}
}
