package ch05;

public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		//studentAhn.studentName = "안승연";
		studentAhn.setStudentName("안승연"); //set메서드를 활요해 private 변수에 접근 가능
		
		//System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
