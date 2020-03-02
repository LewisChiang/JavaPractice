package java_learning.chapter2;

import java.util.Scanner;

/**
 * 2.4
 * @ProjectName JavaPractice
 * @Author Lewis
 * @Date 2020-2-8
 */
public class ComputerAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
