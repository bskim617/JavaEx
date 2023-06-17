package ch09;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer(); 추상 클래스는 인스턴스로 생성할 수 없다. 하지만 추상 클래스에서도 형 변환은 사용할 수 있다.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook(); 추상 클래스는 인스턴스로 생성할 수 없다. 하지만 추상 클래스에서도 형 변환은 사용할 수 있다.
		Computer c4 = new MyNoteBook();
		
	}
}
