package java_practice.chapter2;

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount:");
		int monthly_amount = input.nextInt();
		double total_amount = 0;
		double last_amount = 0;
		
		for(int i=0;i<6;i++) {
			total_amount = (monthly_amount+last_amount)*(1 + 0.00417);
			last_amount = total_amount;
		}
		System.out.println("After the six month, the account value is $" + (int)(total_amount*100)/100.0);
	}
}
