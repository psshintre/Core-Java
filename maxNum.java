package basicprogram;

public class maxNum {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = a>b? a:b;
		System.out.println("max" +result);
		
		int c =3;
		
		int res = (a>b)?(a>c ? a:c):(b>c ? b:c);
		System.out.println("max" +res);	
	}

}
