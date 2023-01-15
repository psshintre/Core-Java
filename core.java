package basicprogram;

public class core {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Cooking");
		str.append("Emerging");
		
		str.insert(2, "Technology");
		System.out.println(str);
		
		str.replace(8, 16, "IOT");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		System.out.println(str.capacity());
		
	}
}
