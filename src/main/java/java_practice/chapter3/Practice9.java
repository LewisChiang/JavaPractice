package java_practice.chapter3;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String a = input.next();
		Integer b=0;
		for(int i=0;i<a.length();i++) {
			b += (Integer.parseInt(a.charAt(i)+""))*(i+1);
//			System.out.println(b);
		}
		int c =b%11;
		System.out.println("The ISBN-10 number is "+a+(c!=10?c:"X"));
		
	}

}
