package java_practice.chapter2;

import java.util.Scanner;

public class ComputerChange2_10 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入总钱数");
	double total = input.nextDouble();
	int remainingpenny =(int) (total * 100); 
	int totaldollars = remainingpenny/100;
	remainingpenny = remainingpenny%100;
	int totalquarters = remainingpenny/25;
	remainingpenny = remainingpenny%25;
	int totaldimes = remainingpenny/10;
	remainingpenny = remainingpenny%10;
	int totalnickels = remainingpenny/5;
	remainingpenny = remainingpenny%5;
	int totalpennies = remainingpenny;
	System.out.println("Your amount " + total+" consists of");
	System.out.println("	" + totaldollars+" dollars");
	System.out.println("	" + totalquarters+" quarters");
	System.out.println("	" + totaldimes+" dimes");
	System.out.println("	" + totalnickels+" nickels");
	System.out.println("	" + totalpennies+" pennies");
	}
}
