package basicprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Bufferex {
    public static void main(String[] args) throws IOException { 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("My name is:" +a);
	}
	}