package ch05;

public class PersonTest {
	public static void main(String[] args) {
		// 디폴트 생성자를 추가해서 오류발생 방지
		Person personKim = new Person(); //생성자
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person personLee = new Person("이순신", 175, 75); // 인스턴스 변수 초기화와 동시에 클래스 생성 
	}
}
