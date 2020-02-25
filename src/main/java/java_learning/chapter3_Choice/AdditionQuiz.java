package java_learning.chapter3_Choice;


import java.util.Scanner;

/**
 * @ ProjectName JavaPractice
 * @ Author     ：Lewis
 * @ Date       ：17:57 2020-2-16
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " +
                        (number1 + number2 == answer));
    }
}
