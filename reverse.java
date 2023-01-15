package basicprogram;
import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {

		String str = "pallavi", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("pallavi");
		
//           using loop
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed word: " + nstr);
	}
}

// using Stringbuilder

//StringBuilder s1=new StringBuilder(s);
//StringBuilder rev1=s1.reverse();
//System.out.println("rev1");

// using tocharArray

//char[] arr=s.toCharArray();
//System.out.println(arr);
//for(int i=arr.length-1; i>=0;i--) {
//	System.out.println(arr[i]);
//}
//	}
//}
