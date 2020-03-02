package java_learning.chapter10;

import java.util.Scanner;

/**
 * Created by Lewis on 2019-8-13.
 */
public class TestLoanClass {
    /**Main method*/
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate
        System.out.print(
                "Enter annual interest rate, for example, 8.25:");
        double annualInterestRate = input.nextDouble();

        //Enter number of years
        System.out.print("Enter number of years as an integer:");
        double numberOfYears = input.nextDouble();

        //Enter loan amount
        System.out.print( "Enter loan amount, for example, 120000.95:");
        double loanAmount = input.nextDouble();

        //Create a loan object


    }
}
