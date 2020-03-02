package java_learning.chapter3;

import java.util.Scanner;

/**
 * @ ProjectName JavaPractice
 * @ Author     ：Lewis
 * @ Date       ：18:25 2020-2-16
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if(number % 5 == 0){
            System.out.println("HiFive");
        }
        if(number % 2 == 0){
            System.out.println("HiEven");
        }
    }
}
