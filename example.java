package xacxsdas;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		//기능1. 음료수 뽑기.					 operate
		//기능2. 뽑을수 있는 음료 종류 한개 추가. 	addBeverage
		//기능3. 기본 4종 음료수 채우기 			init
		//기능4. 뽑기 가능한 음료수 목록  보기 		printBeverageList 
		VendingMachine m1 = new VendingMachine();
	
		m1.init();
		
		for(int i = 0; i < 10; i++) {
			
		System.out.println("1.음료수 뽑기");
		System.out.println("2. 음료수 추가");
		System.out.println("3. 음료수 목록 ");
		System.out.println("4. 음료수 삭제 ");
		System.out.print("메뉴를 선택해주세요. : ");
		int cmd =Integer.parseInt(scan.nextLine());
		
			if(cmd == 1) {
				
				System.out.printf("투입금액을 입력해주세요 :");
				int inputMoney = Integer.parseInt(scan.nextLine());
				System.out.printf("음료수를 선택해주세요 :");
				int bno = Integer.parseInt(scan.nextLine());
				
				m1.operate(inputMoney, bno);
			
				}else if(cmd == 2) {
					System.out.print("추가할 음료수 이름 :");
					String name = scan.nextLine();
					System.out.print("추가할 음료수 가격 :");
					int price = Integer.parseInt(scan.nextLine());
					
					Beverage beverage = new Beverage("식혜", 900);
					m1.addBeverage(beverage);
					
				}else if (cmd == 3 ) {
					m1.printBeverageList();
		 	}
		}

	}
}
