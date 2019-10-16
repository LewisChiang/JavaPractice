package java_practice.chapter1;

public class Practice11 {

	public static void main(String[] args) {
		double population = 312032486, totalSecond = 365*24*60*60;
		double  birth = 7.0, dead = 13.0, move = 45.0;
		double oneyearBirth = totalSecond/birth, oneyearDead = totalSecond/dead, oneyearMove = totalSecond/move;
		for(int i=0;i<5;i++) {
			population = population + oneyearBirth + oneyearMove - oneyearDead;
			System.out.println("第"+(i+1)+"年的人口数量为："+population+"人");
		}
	}

}
