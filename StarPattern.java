package pattern;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the no of line to print");
		int n = ob.nextInt();

		for (int i = 1; i <= n; i++) // for row
		{
			for (int j = 1; j <= 1; j++) // for column
			{
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
