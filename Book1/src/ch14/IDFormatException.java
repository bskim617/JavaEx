package ch14;
// 사용자 정의 예외 구현하기
public class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message);
	}
}
