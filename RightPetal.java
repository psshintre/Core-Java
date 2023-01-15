package pattern;

import java.util.Scanner;

public class RightPetal {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of lines to print : ");
		int n = ob.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(f + " ");
				f++;
			}
			System.out.println();
		}

	}

}