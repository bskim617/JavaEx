package ch06;
//싱글톤
public class Company {
	//private 생성자 만들기
	private Company() {}
	
	//인스턴스 생성하기
	private static Company instance = new Company(); //유일하게 생성한 인스턴스
	
	//인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; //유일하게 생성한 인스턴스 반환
	}
	
}
