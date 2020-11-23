package ClassPractice.src.practiceclasses;

import java.util.ArrayList;

public class StringInstrument{
	private String name;
	private int numberOfStrings;
	private ArrayList<char> strings = new ArrayList<>();
	
	public String getName(){
		return name;
	}
	
	public int getNumberOfStrings(){
		return numberOfStrings;
	}
	
	public void setNumberOfStrings(int numberOfStrings){
		this.numberOfStrings = numberOfStrings;
	}
	
	public ArrayList<char> getStrings(){
		return strings;
	}
	
	public void tune(char[] strings){
		if (strings.length == strings.length){
			for (int i = 0; i < strings.length; i++){
				this.strings[i] = strings[i];
			}
		} else {
			System.out.printf("You must tune all %n strings. Please enter an array of %n strings.%n", this.numberOfStrings, this.numberOfStrings);
		}
	}
	
	public boolean isTuned(){
		boolean tuned = false;
		if (this.strings.length != this.numberOfStrings){
			return tuned
		} else {
			for (int i = 0; i < this.numberOfStrings; i++){
				if (strings[i] != null){
					tuned = true; 
				} else {
					tuned = false;
				}
			}
		}
		return tuned;
	}
	
	public StringInstrument(){}
	
	public StringInstrument(String name, int numberOfStrings){
		this.name = name;
		this.numberOfStrings = numberOfStrings;
	}
	
	public StringInstrument(String name, int numberOfStrings, char[] strings){
		this.name = name;
		this.numberOfStrings = numberOfStrings;
		tune(strings);
	}

}
