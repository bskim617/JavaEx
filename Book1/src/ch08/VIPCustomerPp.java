package ch08;
//고객 관리 프로그램 완성하기(2)
public class VIPCustomerPp extends CustomerPp {
	private int agentID;
	double saleRatio;
	
	public VIPCustomerPp(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 적립
		return price - (int)(price * saleRatio); //할인된 가격을 계산하여 변환
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
