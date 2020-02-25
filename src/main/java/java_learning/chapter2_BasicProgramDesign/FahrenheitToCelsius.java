package java_learning.chapter2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 2.6
 * @ProjectName JavaPractice
 * @Author Lewis
 * @Date 2020-2-8
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit:");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
}
