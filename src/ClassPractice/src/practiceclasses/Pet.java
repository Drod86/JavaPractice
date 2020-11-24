package ClassPractice.src.practiceclasses;
import java.lang.String;

public class Pet{
	private String name;
	private int age;
	private String location;
	private String type;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	
	public void setName(int age){
		this.age = age;
	}
	
	public String getType(){
		return type;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
		
	public Pet(){ }
	
	public Pet(String name, int age, String location, String type){
		
	}
	
}
