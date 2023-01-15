package basicprogram;

import java.util.Arrays;

public class opeg {
	public static void main(String[] args) {
		System.out.println();
		String s1 = new String("Hello");
		String s = " hello  .s ";
		String s2 = "Pallavi";
		String s3 = "My Name is";
		System.out.println(s1+"" +s2);
		System.out.println(s3.concat(s2));
		System.out.println("Length:" +s3.length());
		System.out.println("Substring:" +s3.substring(4,7));
		System.out.println("Uppercase:" +s2.toUpperCase());
		String s4 ="";
		System.out.println("To check a null:" +s3.isEmpty());
		char[]arr = new char[10];
		s3.getChars(0, 10, arr, 0);
		System.out.println("Getchars:" +Arrays.toString(arr));
		System.out.println("Compoarison:" +s.compareTo(s1));
		System.out.println("Equals :" +s1.equals(s));
		System.out.println("StartWith :" +s1.startsWith("He"));
		System.out.println("EndsWith :" +s1.endsWith("p"));
		System.out.println("Replace :" +s2.replace("Pallavi", "Prathamesh"));
		System.out.println("Repeat :" +s.repeat(6));
		System.out.println("charAt :" +s3.charAt(0));
		System.out.println("Trim Lead :" +s.stripleading());
		System.out.println("Trim Trail :" +s3.stripTrailing());
		}

    }


