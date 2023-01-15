package basicprogram;

public class ExceptionHandling {

//	class Exception1 {
//	}
//
//	 class ExceptionDemo {
    	public static void main(String[] args) {
//
//			int a = 10, b = 5;
//			int c = 10 / 0;
//			System.out.println("Value of c: " + c);
//		}
//	}
//
//}
		try {
			int[] numbers = { 1, 2, 3 };
		} catch (Exception e) {
			System.out.println("Some Error in code : ");
		} finally {
			System.out.println("The finally statement lets you execute code, after try....catch," +"regardless of the result");
		}
	}
}
	
//	static void Age(int age) {
//		if (age < 18) {
//			throw new ArithmeticException("Access denied must be at least 18 years old to watch movie");
//		} else {
//			System.out.println("Access granted to watch movie ");
//		}
//	}
//
//	public static void main(String[] args) {
//		Age(14);
//	}

//}