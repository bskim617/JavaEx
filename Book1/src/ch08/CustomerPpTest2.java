package ch08;

import java.util.ArrayList;

// 배열을 활용한 고객 관리 프로그램 구현하기
public class CustomerPpTest2 {
	public static void main(String[] args) {
		ArrayList<CustomerPp> customerList = new ArrayList<CustomerPp>();
		
		CustomerPp customerLee = new CustomerPp(10010, "이순신");
		CustomerPp customerShin = new CustomerPp(10020, "신사임당");
		CustomerPp customerHong = new GoldCustomerPp(10030, "홍길동");
		CustomerPp customerYoul = new GoldCustomerPp(10040, "이율곡");
		CustomerPp customerKim = new VIPCustomerPp(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("======= 고객 정보 출력 =======");
		for(CustomerPp customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======= 할인율과 보너스 포인트 계산 =======");
		int price = 10000;
		for(CustomerPp customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
		
	}
}
