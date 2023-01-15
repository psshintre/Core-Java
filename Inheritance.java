package OOPs;

public class Inheritance {   // Parent class
	int Id = 10;
	 public void display() {
		System.out.println("Student Id :" +Id);		
	}
}

class EnginnerStud extends Inheritance{   // Child class
	String spec = "Information Technology";
	public void displayspec() {
		System.out.println("Stream is :" +spec);	
	}
}
