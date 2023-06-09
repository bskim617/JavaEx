package ch11;
//Object 클래스의 equals() 메서드 사용하기

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toStrign() {
		return studentId + "," + studentName;
	}
	
	//equals의 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	//해쉬 코드 값으로 학번을 반환 하도록 메서드 재정의
	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; //주소 목사
		Student studentSang = new Student(100, "이상원");
		
		//동일한 주소의 두 인스턴스 비교
		if(studentLee == studentLee2) //기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2)) //equals 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		//동일인이지만 인스턴스의 주소가 다른 경우
		if(studentLee == studentSang) //기호로 비교
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang)) //equals 메서드로 비교
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		//Hash코드 메서드 재정의하기
		System.out.println("studentLee의 hashcode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashcode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
			
	}
}
