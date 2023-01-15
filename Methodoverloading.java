package OOPs;

public class Methodoverloading {
	int add(int a, int b) {
		return(a + b);
	}
	void sub(int a, int b) {
		System.out.println(a - b);
	}
	public static void main(String[] args) {
		Methodoverloading m =new Methodoverloading();
		
		int a = m.add(5, 5);
		System.out.println(a);
		System.out.println(m.add(5, 5));
		
		m.sub(5, 2);
	}
}