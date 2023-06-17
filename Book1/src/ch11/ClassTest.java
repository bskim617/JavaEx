package ch11;
// Person의 Class 클래스 가져오기
public class ClassTest {	
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("ch11.Person"); //패키지 이름으로 해야됨 패키지이름.Person
		System.out.println(pClass3.getName());
	}
}
