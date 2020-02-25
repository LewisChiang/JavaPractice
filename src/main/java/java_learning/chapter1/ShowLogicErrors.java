package java_learning.chapter1;

/**
 * @ProjectName JavaPractice
 * @Author Lewis
 * @Date 2020-2-8
 */
public class ShowLogicErrors {
    /**Error: 9.0 / 5 result is a float
     * public static void main(String[] args) {
     *         System.out.println("Celsius 35 is Fahrenheit degree ");
     *         System.out.println((9 / 5) * 35 + 32);
     *     }
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println((9.0 / 5) * 35 + 32);
    }
}
