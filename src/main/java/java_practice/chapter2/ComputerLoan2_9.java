package java_practice.chapter2;

import java.util.Scanner;

public class ComputerLoan2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年利率：（例5.35）");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate/1200;
		System.out.println("请输入贷款额度：");
		double loanAmount = input.nextDouble();
		System.out.println("请输入支付的年数");
		int payOfears = input.nextInt();
		double monthlyPayment = loanAmount*monthlyRate/(1
				-1/Math.pow(1+monthlyRate, payOfears*12));
		System.out.println("你的月支付额度为：" + (int)(monthlyPayment*100)/100.0);
		double totalPayment = monthlyPayment*payOfears*12;
		System.out.println("你的总支付额度为：" + (int)(totalPayment*100)/100.0 );
		input.close();

	}

}
