package java_learning.chapter6;

import java.util.Scanner;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-06
 */
public class Hex2Dec {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a Hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
           char hexChar = hex.charAt(i);
               decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }else{ //ch is ' O *. '1' or '91
            return ch - '0';
        }
    }

}
