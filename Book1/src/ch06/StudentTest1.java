package ch06;
// static 변수 테스트하기

public class StudentTest1 {
	public static void main(String[] args) {
		StaticStudent studentLee = new StaticStudent();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); //serialNum 변수 초깃값 출력
		studentLee.serialNum++; //static 변수 값 증가
		
		StaticStudent studentSon = new StaticStudent();
		studentLee.setStudentName("손수경");
		System.out.println(studentSon.serialNum); //증가된 값 출력
		System.out.println(studentLee.serialNum); 
	}
	
}
