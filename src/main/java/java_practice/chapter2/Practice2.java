package java_practice.chapter2;

import java.util.Scanner;

/**
 * @ProjectName JavaPractice
 * @Author     ：Lewis
 * @Date       ：17:29 2020-2-16
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = (int)(radius * radius * 3.14159 * 10000)/10000.0;
        double volume = (int)(area * length * 10)/10.0;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
