package ch03;

public class OperationEx2 {
	//증가 감소 연산자를 사용하여 값 연산하기
	public static void main(String[] args) {
		int gameScore = 150; //게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore; //gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore; //gameScore에 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);
		
		//증가 감소 연산자의 위치
		int value = 10;
		int num = ++value; //num에 11이 대입됨
		
		System.out.println(num);
		
		int value2 = 10;
		int num2 = value2++; //num2에 10이 대입됨
		System.out.println(num2);
	}
}
