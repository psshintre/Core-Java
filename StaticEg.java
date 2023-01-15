package basicprogram;

public class StaticEg {
	static int a, b;
	static String n;

	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
	}

	public static void main(String[] args) {
		a = 10;
		b = 20;
		n = "Pallavi";
		display();
	}

}
