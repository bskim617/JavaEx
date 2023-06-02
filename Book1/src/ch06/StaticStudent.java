package ch06;
//static 변수 사용하기
public class StaticStudent {
	public static int serialNum = 1000; //static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;	//학생 이름
	public int grade; 			//학년
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
