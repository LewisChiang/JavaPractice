package java_practice.chapter1;

public class Practice10 {

	public static void main(String[] args) {
		int minute = 45, second = 30;
		double dis = 14/1.6;
		double hour = minute/60.0 + second/3600.0;
		double speed = dis/hour;
		System.out.println("速度为每小时"+speed+"英里");

	}

}
