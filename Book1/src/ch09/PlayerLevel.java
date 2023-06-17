package ch09;
//템플릿 메서드 응용하기 - PlayerLevel 추상 클래스 구현하기
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
