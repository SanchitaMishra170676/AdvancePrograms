package dataStructures;

public class student {

	int roll;
	String name;
	double percentage ;
	
	public student (int roll, String name, double percentage)
	{
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}
	
	public String toString() {
		return name+ " " + roll + " " + percentage;
		
	}
	
}
