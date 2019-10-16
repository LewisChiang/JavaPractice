package java_practice.chapter2;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number beteen 0 and 1000:");
		int num = input.nextInt();
		int hun = num/100;
		int res = num%100;
		int ten = res/10;
		int sin = ten%10;
		int total = hun + ten + sin;
		System.out.println("The sum of the digits is " + total);
	}

}
