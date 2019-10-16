package java_practice.chapter3;

import java.util.Scanner;

public class LeapYear3_7 {

	public static void main(String[] args) {
		System.out.println("Enter a year:");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		boolean c=(year%4==0&&year%100!=0)||year%400==0;
		System.out.println(year +" is a leap year? "+c);
	}

}
