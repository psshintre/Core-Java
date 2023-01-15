package basicprogram;

import java.util.Scanner;

public class operation {
	public static void main(String[] args) {
//		int a = 10, b = 5;
//	System.out.println("a + b =" + (a + b));
//	System.out.println("a - b =" + (a - b));
//	System.out.println("a * b =" + (a * b));
//	System.out.println("a / b =" + (a / b));
//		
         Scanner s = new Scanner(System.in);
         System.out.println("Enter value of a and b:" );
         int x = s.nextInt();
         int y = s.nextInt();
         System.out.println("Enter your percentage :" );
         float per = s.nextFloat();
         System.out.println("Enter your name :");
         String name = s.next();
         char ch = name.charAt(0);
         System.out.println("percentage :" +per);
         System.out.println("name :" +name);
         
	}
}
