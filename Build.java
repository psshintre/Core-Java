package basicprogram;

public class Build{
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Cooking ");
		str.append("Emerging ");
		System.out.println(str);
		str.insert(17, "Technology ");
		System.out.println(str);
		str.replace(8, 16, "IoT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println(str.capacity());

		StringBuffer sb1 = new StringBuffer();
		// printing default capacity of string buffer
		System.out.println("sb1: default capacity: " + sb1.capacity());
		// current size 16+10 = 26
		StringBuffer sb2 = new StringBuffer("Welcome to");
		System.out.println("sb2: After declaration capacity: " + sb2.capacity());

	}

}