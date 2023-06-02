package ch07;
// 배열 길이만큼 출력하기
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//배열의 첫 번째 요소부터 열 번째 요소까지 10개 요소값 출력 
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
