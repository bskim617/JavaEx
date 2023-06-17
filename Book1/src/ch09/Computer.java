package ch09;
// 추상 클래스 구현하기
public abstract class Computer {	//여기도 abstract 추가 해야 오류 안발생
	public abstract void display(); //abstract 추가 안하면 오류
	public abstract void typing();  //abstract 추가 안하면 오류
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
