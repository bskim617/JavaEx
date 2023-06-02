package ch05;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student(); // 첫 번째 학생 생성
		//student1.studentName = "안연수";
		student1.setStudentName("안연수");
		
		Student student2 = new Student(); // 두 번째 학생 생성
		//student2.studentName = "안승연";
		student2.setStudentName("안승연");
		
		System.out.println(student1); //참조 변수값 출력
		System.out.println(student2); //참조 변수값 출력
		
	}
}
