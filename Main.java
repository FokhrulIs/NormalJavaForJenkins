/**
 * 
 */
package normaljava;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String name =s.next();
		Integer age =s.nextInt();
		long mobile =s.nextLong();
		String address =s.next();
		String work =s.next();
		String position =s.next();
		
				
	
		System.out.println("My name is " +name+ ". I am "+age+  "years old.My phone number is: "+mobile+
				". My Address is: " +address+ ". Now I am Working "+work+ " Company. As a "+position); 
	}

}

