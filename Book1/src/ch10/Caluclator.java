package ch10;
// 인터페이스 구현하기
public abstract class Caluclator implements Calc { //추상 클래스 times와 divide를 구현하지 않았음으로

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
	
}
