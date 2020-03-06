package java_learning.chapter5;

/**
 * @ProjectName JavaPractice
 * @Author :Lewis
 * @Date :2020-03-05
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0;
        while(tuition <20000){
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year );
    }
}