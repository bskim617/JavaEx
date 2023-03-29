package ch03;

public class OperationEx5 {
	//비트 이동 연산자를 사용하여 연산하기
	public static void main(String[] args) {
		int num = 0B00000101; //5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2); //왼쪽으로 2비트 이동 00010100(20)
		System.out.println(num >> 2); //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num >>> 2); //오른쪽으로 2비트 이동 00000001 (1)
		
		System.out.println(num); //num에 값을 대입하지 않았으므로 비트 이동과 관계없이 값 그대로 출력
		
		num = num << 2; //왼쪽으로 2비트 이동한 값을 다시 num에 대입
		System.out.println(num);
		
		/*
		 * 연산자 우선순위
		 * - 단항 연산자가 가장 높고 이항, 삼항 연산자 순서
		 * - 대입연산자의 우선순위가 가장 낮음
		 * - 산술, 관계, 논리, 대입연산자 순서로 우선순위를 가지며 ()의 우선순위가 가장 높음
		 */
		
	}
}
