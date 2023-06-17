package ch08;

import java.util.ArrayList;

// 다형성 테스트하기
//instanceof로 원래 인스턴스 형 확인 후 다운 캐스팅하기

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest1 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		/*
		 * AnimalTest1 aTest = new AnimalTest1(); 
		 * aTest.moveAnimal(new Human());
		 * aTest.moveAnimal(new Tiger()); 
		 * aTest.moveAnimal(new Eagle());
		 */
		
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
		
	}
	
	/*
	 * public void moveAnimal(Animal animal) { animal.move(); }
	 */
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	//모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);			//Animal형으로 가져옴
			if(ani instanceof Human) {				//Human이면
				Human h = (Human)ani;				//Human형으로 다운 캐스팅
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}
