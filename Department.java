package Pack2;

import java.util.Scanner;

import Pack1.*;

public class Department extends Employee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Employee number and name :" );
		int a = s.nextInt();
		String s1 = s.next();
		Employee e = new Employee();
		e.display();

	}
}