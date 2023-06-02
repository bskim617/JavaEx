package ch06;
//클래스 이름으로 static 변수 참조하기
public class StaticStudentTest3 {
	public static void main(String[] args) {
		StaticStudent1 studentLee = new StaticStudent1();
		studentLee.setStudentName("이지원");
		System.out.println(StaticStudent1.serialNum); //시리얼 번호 변수를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		StaticStudent1 studentSon = new StaticStudent1();
		studentSon.setStudentName("손수경");
		System.out.println(StaticStudent1.serialNum); //시리얼 번호 변수를 직접 클래스 이름으로 참조
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}
}
