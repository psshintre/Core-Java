package Pack1;
class ProtectClass{
	int a = 10;
	public void display() {
		System.out.println("protectedclass " +a);
	}
}
public class ProtectDemo {
	public static void main(String[] args) {
		ProtectClass p = new ProtectClass();
		p.display();
	}
}
	