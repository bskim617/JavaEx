package ch07;
// 향상된 for문 사용하기
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		//변수에는 배열의 각 요소가 대입
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
