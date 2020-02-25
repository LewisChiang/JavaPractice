package java_learning.chapter3_Choice;

import java.util.Scanner;

/**
 * @ ProjectName JavaPractice
 * @ Author     ：Lewis
 * @ Date       ：18:10 2020-2-19
 */
public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 ==0) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
