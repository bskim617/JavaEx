package ch04;

public class Loopexample {
	//중첩된 반복문
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); //한줄 띄어서 출력
		}
	}
}
