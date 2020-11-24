package ClassPractice.src.practiceclasses;

import java.util.ArrayList;

public class StringInstrument{
	private String name;
	private int numberOfStrings;
	private ArrayList<String> strings = new ArrayList<String>();
	
	public String getName(){
		return name;
	}
	
	public int getNumberOfStrings(){
		return numberOfStrings;
	}
	
	public void setNumberOfStrings(int numberOfStrings){
		this.numberOfStrings = numberOfStrings;
	}
	
	public ArrayList<String> getStrings(){
		return strings;
	}
	
	public void tune(ArrayList<String> strings){
		if (this.strings.size() == strings.size()){
			for (int i = 0; i < strings.size(); i++){
				this.strings.set(i, strings.get(i));
			}
		} else {
			System.out.printf("You must tune all %n strings. Please enter an array of %n strings.%n", this.numberOfStrings, this.numberOfStrings);
		}
	}
	
	public boolean isTuned(){
		boolean tuned = false;
		if (this.strings.size() != this.numberOfStrings){
			return tuned;
		} else {
			for (int i = 0; i < this.numberOfStrings; i++){
				if (strings.get(i) != null){
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
	
	public StringInstrument(String name, int numberOfStrings, ArrayList<String> strings){
		this.name = name;
		this.numberOfStrings = numberOfStrings;
		tune(strings);
	}

}
