package basicprogram;
class Subject{
	int javamarks;
	int pythonmarks;
	
}
public class Instancevariable {
public void displayAge() {
	int age = 0;
	age += 10;
	System.out.println("Age:" +age);
	
	
}
public static void main( String[] args ) {
Instancevariable instancevariable = new Instancevariable();
instancevariable.displayAge();
Subject s = new Subject();
s.javamarks = 45;
s.pythonmarks = 44;
System.out.println("java marks :" +s.javamarks);
System.out.println("python marks :" +s.pythonmarks);
}
}
