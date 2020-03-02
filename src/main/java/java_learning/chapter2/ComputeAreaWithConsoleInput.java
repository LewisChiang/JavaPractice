package java_learning.chapter2;

import java.util.Scanner;

/**
 * 2.2
 * Created by Lewis on 2019-10-21.
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius *3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + "is " + area);
    }
}
