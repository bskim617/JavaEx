package ch06;

//학생, 버스, 지하철 객체 협력하기 - 버스와 지하철 타기

public class TakeTrans {
	public static void main(String[] args) {
		//학생 두 명 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);			//노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);		//제입스가 100번 버스를 탑
		studentJames.showInfo();			//제임스 정보 출력
		bus100.showInfo();					//버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");		//노선 번호가 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen);		//토마스가 2호선을 
		studentTomas.showInfo();					//토마스 정보 출력
		subwayGreen.showInfo();						//지하철 정보 출력	
	}
}
