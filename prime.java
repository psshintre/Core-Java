package basicprogram;

public class prime {
//	public static void main(String[] args) {

//	    int num = 29;
//	    boolean flag = false;
//	    for (int i = 2; i <= num / 2; ++i) {
//	      // condition for non prime number
//	      if (num % i == 0) {
//	        flag = true;
//	        break;
//	      }
//	    }

//	    if (!flag)
//	      System.out.println(num + " is a prime number.");
//	    else
//	      System.out.println(num + " is not a prime number.");
//	  }
//	}

// prime no between 1 to 50 
	
public static void main (String[] args)
{		
    int i =0;
    int num =0;
    
    String  primeNumbers = "";

    for (i = 1; i <= 50; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
    System.out.println("Prime numbers from 1 to 50 are :");
    System.out.println(primeNumbers);
}
}
