package java_learning.chapter5;

import java.util.Scanner;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-03
 */
public class SentinelValue {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the output ends if it is 0): ");
        int data = input.nextInt();

        // keep reading data until the input is 0
        int sum = 0;
        while(data !=0){
            sum += data;

            // read the next data
            System.out.print("Enter an integer (the output ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
