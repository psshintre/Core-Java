package basicprogram;

public class StaticVariable {
	static int ab=10;
	public static void main(String args[]) {
		
	Student s1 = new Student();
	s1.showData();
	Student s2 = new Student();
	s2.showData();
	System.out.println(StaticVariable.ab);
	}		
}
class Student{
	int a;
	static int b;//intialized to zero only when class is loaded not for each object created.
	Student(){
		a++;
	}
	public void showData() {
		System.out.println("Value of a = " +a);//0
		System.out.println("Value of a = " +a++);//1
		System.out.println("Value of b = " +b);
	}			
}