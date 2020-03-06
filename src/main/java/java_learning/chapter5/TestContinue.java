package java_learning.chapter5;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-05
 */
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while(number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
