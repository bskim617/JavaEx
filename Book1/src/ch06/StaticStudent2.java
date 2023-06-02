package ch06;
// serialNum의 get, set 메서드 사용하기
public class StaticStudent2 {
	private static int serialNum = 1000; //private 변수로 변경
	public int studentID;
	public String studentName;	
	public int grade; 			
	public String address;
	
	public StaticStudent2() {
		serialNum++; 
		studentID = serialNum; 
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	//get 메서드
	public static int getSerialNum() { 
		int i = 10;
		return serialNum;
	}
	
	//set 메서드
	public static void setSerialNum(int serialNum) {
		StaticStudent2.serialNum = serialNum;
	}
}
