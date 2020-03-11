package java_learning.chapter6;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-09
 */
public class RandomCharacter {
    /** Generate a random character between chl and ch2 */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit letter */
    public static char getRandomDigitCaseLetter(){
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter(){
       return getRandomCharacter('\u0000','\uFFFF');
    }
}
