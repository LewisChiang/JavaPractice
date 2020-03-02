package java_learning.chapter5;

import java.util.Scanner;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-02
 */
public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();

        if(guess == number){
            System.out.println("Yes, the number is " + number);
        }else if(guess > number){
            System.out.println("Your guess is to high");
        }else{
            System.out.println("Your guess is to low");
        }
    }
}
