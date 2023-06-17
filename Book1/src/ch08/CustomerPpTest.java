package ch08;
// 고객 관리 프로그램 완성하기(3)
public class CustomerPpTest {
	public static void main(String[] args) {
		CustomerPp customerLee = new CustomerPp();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		CustomerPp customerKim = new VIPCustomerPp(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("======= 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "님이" + + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.getCustomerName() + "님이" + + kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
	}
}
