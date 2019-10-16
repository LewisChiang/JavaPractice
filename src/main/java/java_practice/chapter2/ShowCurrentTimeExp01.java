/*通过调用currentTimeMillis()返回当前时间
 *方法如下：
 *调用 System.currentTimeMillis()方法获取1970年1月1日午夜到现在的毫秒数*/
package java_practice.chapter2;

public class ShowCurrentTimeExp01 {

	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// compute the current seconds since midnight, Jan 1, 1970
		long currentSeconds = totalSeconds % 60;
		
		// Obtain the total minutes 
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minutes
		long currentMinutes = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours =totalMinutes/60;
		
		//Compute the current hours
		long currentHours = totalHours%24;
//		long totalDay = totalHours/24;
//		long currentDay = totalDay%365;
		System.out.println("Current time is " +currentHours + ":"
			+ currentMinutes +":" + currentSeconds + "");
		

	}

}
