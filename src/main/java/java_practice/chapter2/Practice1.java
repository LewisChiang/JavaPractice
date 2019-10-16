package java_practice.chapter2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double tem = input.nextDouble();
		double cal = 9.0/5*tem+32;
		System.out.println(tem + " Celsius is " + cal+ " Fahrenheit");

	}

}
