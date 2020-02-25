package java_learning.chapter2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 2.8
 * @ProjectName JavaPractice
 * @Author Lewis
 * @Date 2020-2-8
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
