package java_learning.chapter3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits):");
		int guess=input.nextInt();
		int random=(int)(Math.random()*100);
		int rum1=random/10;
		int rum2=random%10;
		int gnu1=random/10;
		int gnu2=random%10;
		System.out.println("The lottery number is "+random);
		
		if(guess==random) {
			System.out.println("Exact match: you win $10,000");
		}else if(rum1==gnu2&&rum2==gnu1) {
			System.out.println("Match all digits: you win $3,000");
		}else if(rum1==gnu2||rum2==gnu1||rum1==gnu1||rum2==gnu2) {
			System.out.println("Match one digit: you win $1,000");
		}else {
			System.out.println("Sorry: no match");
		}
		
	}

}
