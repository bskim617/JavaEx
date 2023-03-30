package ch04;

public class ForExample1 {
	//for문 예제
	public static void main(String[] args) {
		int i;
		int sum;
		
		//기본 구조 - for(초기화식; 조건식, 증감식) {수행문;}
		for(i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
	}
}
