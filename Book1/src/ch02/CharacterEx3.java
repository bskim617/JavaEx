package ch02;

public class CharacterEx3 {
	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; 문자형 변수에 음수를 넣으면 오류가 발생
		
		System.out.println((char)a);
		System.out.println((char)b); //char형으로 선언한 변수에 음수 값을 대입하면 오류 발생, 알수 없는 문자
		System.out.println(a2);
	}
}
