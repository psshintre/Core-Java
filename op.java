package basicprogram;

import java.util.Scanner;

public class op {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter an operator");
		char op =s.next().charAt(0);
		
		switch(op) {
		case'+' :
			System.out.format("%d+%d=/n" , a,b,a+b);
			break;
			default:
				System.out.println("Invalid");
				
		}
		
	}

}
