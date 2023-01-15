package Pack1;
class PrivateClass{
	private int a = 12;
	
	void display() {
		System.out.println("Private variable " +a);
}
}
public class PrivateDemo {
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		System.out.println(p.a);
		p.display();
	}

}
