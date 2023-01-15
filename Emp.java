package OOPs;

public class Emp {
	
	String ename = "pallavi";
	int eno;
	Emp(int eno){
		this.eno = eno;
	}
void display() {
	System.out.println("Employee class :");
	
}
}
class Dept extends Emp {
	String ename = "Abc";
	Dept(){
	super (19);
	}
	void display() {
		System.out.println("Department class :");
	}
	
        public static void main(String[] args) {
		Dept d = new Dept();
		d.display();
//		Emp e = new Emp();
//		e.display();
	}
}