package ch09;
// 상수 사용하기
public class UsingDefine {
	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING); // static으로 선언했으므로 인스턴스를 생성하지 않고 클래스 이름으로 창조 가능
		System.out.println("최솟값은 " + Define.MIN);
		System.out.println("최댓값은 " + Define.MAX);
		System.out.println("수학과목 코드 값은 " + Define.MATH);
		System.out.println("영어과목 코드 값은 " + Define.ENG);
	}
}
