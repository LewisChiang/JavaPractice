package java_practice.chapter1;

public class Practice5_6_7 {

	public static void main(String[] args) {
		// 第五题
		double a = (9.5*4.5-2.5*3)/(45.5-3.5);
		System.out.println(a);
		//第六题
		int count = 0;
		for(int i=1;i<10;i++) {
			count+=i;
		}
		System.out.println(count);
		//第七题
		double count1 = 0;
		for(int i=1;i<100000;i++) {
			if(i%2==1) {
				count1 +=1.0/(2*i-1);
			}else {
				count1 -=1.0/(2*i-1);
			}
		}
		double total = count1*4;
		System.out.println(total);
	}

}
