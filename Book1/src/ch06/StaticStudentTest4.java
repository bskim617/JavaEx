package ch06;
//학번 출력하기
public class StaticStudentTest4 {
	public static void main(String[] args) {
		StaticStudent2 studentLee = new StaticStudent2();
		studentLee.setStudentName("이지원");
		//serialNum 값을 가져오기 위해 get()메서드를 클래스 이름으로 직접 호출
		System.out.println(StaticStudent2.getSerialNum()); 
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		StaticStudent2 studentSon = new StaticStudent2();
		studentSon.setStudentName("손수경");
		//serialNum 값을 가져오기 위해 get()메서드를 클래스 이름으로 직접 호출
		System.out.println(StaticStudent2.getSerialNum()); 
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}
}
