package java_learning.chapter2_BasicProgramDesign;

/**
 * 2.1
 * Created by Lewis on 2019-10-21.
 */
public class ComputerArea {
    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; //radius is now 20

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + "is " + area);
    }
}
