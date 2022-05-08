package xacxsdas;

public class VendingMachine {
	
	int remainder = 0;
	Beverage[] beverages = new Beverage[10]; // 음료수 10개를 저장할 수 있는 공간 배열을 만듬. 
	
	
	//선언한다. 
	
	
	//대입 --> 연산. // 연산은 함수에서 해야한다. 클래스에서 못쓴다. 
	
	public void init() { // 음료수 4개 탁탁 채워짐 이걸 실행 해야만;
		
		
		Beverage b1 = new Beverage("콜라", 1200);
		Beverage b2 = new Beverage("사이다", 1000);
		Beverage b3 = new Beverage("커피", 800);
		Beverage b4 = new Beverage("생수", 600);
		
		
		beverage[0] = b1;
		beverage[1] = b2;
		beverage[2] = b3;
		beverage[3] = b4;
	
	}
	
	public void addBeverage(Beverage beverage) {
		
		
		// 1. beverages 배열의 길이는 4이다. 마지막 인덱스가 3이다. 
		beverage[4]= beverage;
	}
	
	public String operate(int inputMoney, int bno) {
			// 음료 목록
		
		
		Beverage target = beverages[bno];
			
//			String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
//			int[] beveragePrices = {1200, 1000, 800, 600};
			
			System.out.printf("투입 금액은 %d입니다.\n", inputMoney);
			remainder = remainder + inputMoney;
			
			
			if(remainder < target.price) {
				System.out.println("잔액이 부족합니다.");
				return null;
			}
			
			System.out.printf("%s를 뽑으셨습니다.\n", target.name);
			
			remainder = remainder - target.price;
			
			System.out.printf("잔액은 %d입니다.\n", remainder);
			
			return target.name;

			
	}
}


class Beverage {
	String name;
	int price;
	
	
	public Beverage(String data1, int data2) {
		name = data1;
		price = data2;
		
	}
}