package java_practice.chapter3;

import java.util.Scanner;

public class Lottery3_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits):");
		int guess=input.nextInt();
		int random=(int)(Math.random()*100);
		int rnum1=random/10;
		int rnum2=random%10;
		int gnum1=random/10;
		int gnum2=random%10;
		System.out.println("The lottery number is "+random);
		
		if(guess==random) {
			System.out.println("Exact match: you win $10,000");
		}else if(rnum1==gnum2&&rnum2==gnum1) {
			System.out.println("Match all digits: you win $3,000");
		}else if(rnum1==gnum2||rnum2==gnum1||rnum1==gnum1||rnum2==gnum2) {
			System.out.println("Match one digit: you win $1,000");
		}else {
			System.out.println("Sorry: no match");
		}
		
	}

}
