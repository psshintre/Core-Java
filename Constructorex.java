package OOPs;

import java.util.stream.Collector;

// Default Constructor AND Parameterized Constructor

public class Constructorex {
	String city;
	static String name = "";
	int rollno;
	String course;

	public Constructorex() {
		System.out.println("Default");
		name = "Pallavi";
	}
// this and parameterized constructor using single argument
	Constructorex(String city) {
		city = city;
		System.out.println("I stay at " + city);
	}
	// parameterized constructor using two argument
	Constructorex(int r, String cr) {
		rollno = r;
		course = cr;
		System.out.println("Rollno: and course" + rollno + "" + course);
	}
	Constructorex(Constructorex a ){
		System.out.println("Copy Constructor.");
		rollno = a.rollno;
		course = a.course;	
		}
public class Student {
	public void main(String[] args) {
		Constructorex c = new Constructorex();
		System.out.println("My name is " + c.name);
		Constructorex c1 = new Constructorex("Mumbai");
		Constructorex c2 = new Constructorex( 21, "JFS");
		Constructorex c3 = new Constructorex(c2);
		System.out.println("Copy rollno and course " + c3.rollno +"" +c3.course);
	}
}
}
	