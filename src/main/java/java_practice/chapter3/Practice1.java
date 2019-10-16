package java_practice.chapter3;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a:");
		double a=input.nextDouble();
		System.out.println("Enter b:");
		double b=input.nextDouble();
		System.out.println("Enter c:");
		double c=input.nextDouble();
		double k=b*b-4*a*c;
		if(k>0) {
			double r1=(-b+Math.pow(k, 1/2.0))/(2*a);
			double r2=(-b-Math.pow(k, 1/2.0))/(2*a);
			System.out.println("The equation has two roots:"+r1+" and "+r2);
		}else if(k==0) {
			System.out.println("The equation has one root:"+(-b/(2*a)));
		}else {
			System.out.println("The equation has no real roots");
		}
	}

}
