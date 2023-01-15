package Pack1;
class DefaultClass{   //parent class
	int a = 12;
	
	void display() {
		System.out.println("Default class variable " +a);
	}
	
}
class DefaultSub extends DefaultClass{   //sub class
	void displaySub() {
		System.out.println("Default  sub class variable " +a);
}
}
public class DefaultDemo {
	public static void main(String[] args) {
	DefaultSub d = new DefaultSub();
	d.display();
	d.displaySub();
	}
}
