package ch06;
//학번 확인하기
public class StaticStudentTest2 {
	public static void main(String[] args) {
		StaticStudent1 studentLee = new StaticStudent1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		StaticStudent1 studentSon = new StaticStudent1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}
}
