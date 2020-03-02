package java_learning.chapter2;

import java.util.Scanner;

/**
 * 2.3
 * @ProjectName JavaPractice
 * @Author Lewis
 * @Date 2020-2-7
 */
public class ComputerAverage {

    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new  Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.print("Enter three numbers:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Computer average
        double average = (number1 + number2 + number3) / 3;

        //Display results
        System.out.println("The average of " + number1 + " " + number2
            + " " +  number3 + " is " + average);
    }
}
