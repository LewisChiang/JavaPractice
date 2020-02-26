package java_learning.chapter4;

import java.util.Scanner;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-02-26
 */
public class LotteryUsingString {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random() * 10) +(int)(Math.random() * 10);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits):");
        String guess = input.nextLine();

        // get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // get digits from guess
        char guessDigit1 = lottery.charAt(0);
        char guessDigit2 = lottery.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // check the guess
        if(guess.equals(lottery)){
            System.out.println("Exactly match : you win $10,000");
        }else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1){
            System.out.println("Match all digits : you win $3,000");
        }else if(guessDigit1 == lotteryDigit1
                ||guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2){
            System.out.println("Match one digit : you win $1,000");
        }else{
            System.out.println("Sorry, no match");
        }
    }
}
