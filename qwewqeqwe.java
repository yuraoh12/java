package xacxsdas;

public class qwewqeqwe {
	
	
	public static String vendingMachine(int inputMoney, int bno) {
		
		//음료 목록 
		String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("잔액이 부족합니다.");
			return null;
		}
		return beverageNames[bno];
		
	}

	public static void main(String[] args) {

		// 돈, 뽑을 음료수
		// 0 : 콜라/ 1: 사이다(1000) / 2: 커피(800) / 3: 생수(600) 
		String beverage = vendingMachine(1000, 0);
		
		System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.", "소주" );
		
	}

}
