package ch13;
// 정적 내부 클래스 예제

class OutClass2{						
	private int num = 10; 			
	private static int sNum = 20; 	
	
	static class InStaticClass {		//정적 내부 클래스					
		int inNum = 100;				//정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;		//정적 내부 클래스의 정적 변수
		
		void inTest() { //정적 내부 클래스의 일반 메서드
			//num += 10;  	외부 클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			//num += 10;  외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없다.
			//inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass2.InStaticClass.sTest();
		
	}
}
