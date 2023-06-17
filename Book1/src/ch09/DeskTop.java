package ch09;

public class DeskTop extends Computer {
	// 추상 메서드의 몸체 코드 작성
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
}
