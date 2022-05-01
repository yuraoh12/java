package xacxsdas;

import java.util.Scanner;

public class qwewqeqwe {
	
	
	public static String vendingMachine(int inputMoney, int bno) {
		
		//음료 목록 
		String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("잔액이 부족합니다.");
			return null;
		}
		
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("잔액은 %d입니다. \n", remainder);

		return beverageNames[bno];
		
	}
//
//	public static void main(String[] args) {
//
//		
//		String beverage = vendingMachine(2000 ,1); // 여기서 끝 1은 음료수 메뉴 1,2,3,4를 의미함. 
//		
//		if(beverage == null ) {
//			System.out.printf("홍길동은 음료수를 뽑지 못했습니다. ");
//		} else {
//			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.", beverage );
//
//		}
//		
//	}	
//		// 돈, 뽑을 음료수
//		// 0 : 콜라/ 1: 사이다(1000) / 2: 커피(800) / 3: 생수(600) 
//		String beverage = vendingMachine(1000, 3);
//		
//		if(beverage == null ) {
//			System.out.printf("홍길동은 음료수를 뽑지 못했습니다. ");
//		} else {
//		System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.", "생수" );
//		
//	}

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		 
		// 돈, 뽑을 음료수 
		// 0 - 콜라(1200), 1 - 사이다(1000), 2 - 커피(800), 3 - 생수(600)
		
		String beverage = vendingMachine(2000, 0);
		
		if(beverage == null) {
			System.out.println("홍길동은 음료수를 뽑지 못했습니다.");
		} else {			
			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.", beverage);
		}
		
		System.out.println("================ 음료수 목록 ==============");
		System.out.println("0 : 콜라 (1200원)");
		System.out.println("1 : 사이다 (1000원)");
		System.out.println("2 : 커피 (800원)");
		System.out.println("3 : 생수 (600원)");
		System.out.println("===============================");
		
		System.out.println("얼마의 금액을 투입하시겠습니까:");
		int inputMoney = Integer.parseInt(scan.nextLine());
		
		System.out.print("어떤 음료수를 선택하시겠습니까 :");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		
		
		
		
		
		String beverage2 = vendingMachine(inputMoney, bno);
		
		if(beverage2 == null) {
			System.out.println("홍길순은 음료수를 뽑지 못했습니다.");
		} else {			
			System.out.printf("홍길순이 %s를 벌컥벌컥 마십니다.", beverage2);
		}	
	}
	
}
