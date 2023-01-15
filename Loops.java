package basicprogram;
// While loop
import java.util.*;

public class Loops {
	public static void main(String[] args) {  
//	    int i=1;  int j=1;
//	    while(i<=10){  
//	        System.out.println(i);  
//	    i++;  
//	    }  
//	  }  



// do While loop   
//    int j=1;    
//    do{    
//        System.out.println(j);    
//    j++;    
//    }while(j<=10);    
//}    
//}    


	         // TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		float res, a, b;
//		char choice, ch;
//		do {
//			System.out.println("Main Choices:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
//
//			System.out.println("Enter your choice: ");
//
//			choice = s.next().charAt(0);
//
//			switch (choice) {
//			case '1':
//				System.out.println("Enter two number:");
//				a = s.nextFloat();
//				b = s.nextFloat();
//				res = a + b;
//				System.out.println("Result: " + res);
//				break;
//
//			case '2':
//				System.out.println("Enter two number:");
//				a = s.nextFloat();
//				b = s.nextFloat();
//				res = a - b;
//				System.out.println("Result: " + res);
//				break;
//
//			case '3':
//				System.out.println("Enter two number:");
//				a = s.nextFloat();
//				b = s.nextFloat();
//				res = a * b;
//				System.out.println("Rresult: " + res);
//				break;
//
//			case '4':
//				System.out.println("Enter two number:");
//				a = s.nextFloat();
//				b = s.nextFloat();
//				res = a / b;
//				System.out.println("Rresult: " + res);
//				break;
//
//			case '5':
//				System.exit(0);
//				break;
//
//			default:
//				System.out.println("Wrong Choice.............\n");
//				break;
//
//			}
//		} while (choice != 5);
//
//	}
//
//}
		
		
		
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = s.nextInt();
			int sum = 0;
			while(num>0) {
				int rem = num%10;
				sum = sum+rem;
				num = num/10;
			}
			System.out.println("Sum of Digit:"+sum);

		}

	}	
	
				
				
			
	