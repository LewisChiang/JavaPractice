package java_learning.chapter30;

public class TaskThreadDemo {
	public static void main(String[] args) {
		//Create tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}	
	//The task for printing a character a specified number of times
	class PrintChar implements Runnable{
		private char charToPrint; //The character to print
		private int times; //The number of times to repeat
		
		/**Construct a task with a specified character and number of 
		 * times to print the character
		 */
		public PrintChar(char c, int t) {
			charToPrint = c;
			times = t;
		}
		@Override /*Override the run() method to tell the system what task to perform*/
		public void run() {
			for (int i = 0; i < times; i++) {
				System.out.println(charToPrint);
			}
			
		}
		
	}
	
	class PrintNum implements Runnable{
		private int lastNum;
		
		public PrintNum(int n) {
			lastNum = n;
		}
		@Override /*Override the run() method to tell the system what task to perform*/
		public void run() {
			for (int i = 0; i < lastNum; i++) {
				System.out.println(" " + i);
			}
			
		}
		
	}



