package basicprogram;

public class ThisEx {
	String name;

	public ThisEx(String name) {
		super();
		this.name = name;
		System.out.println("Name is :- " +this.name);
	}

	public static void main(String[] args) {
		ThisEx t = new ThisEx("pallavi");
		System.out.println("Object t " + t.name);
	}

}
