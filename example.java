package xacxsdas;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		//���1. ����� �̱�.					 operate
		//���2. ������ �ִ� ���� ���� �Ѱ� �߰�. 	addBeverage
		//���3. �⺻ 4�� ����� ä��� 			init
		//���4. �̱� ������ ����� ���  ���� 		printBeverageList 
		VendingMachine m1 = new VendingMachine();
	
		m1.init();
		
		for(int i = 0; i < 10; i++) {
			
		System.out.println("1.����� �̱�");
		System.out.println("2. ����� �߰�");
		System.out.println("3. ����� ��� ");
		System.out.println("4. ����� ���� ");
		System.out.print("�޴��� �������ּ���. : ");
		int cmd =Integer.parseInt(scan.nextLine());
		
			if(cmd == 1) {
				
				System.out.printf("���Աݾ��� �Է����ּ��� :");
				int inputMoney = Integer.parseInt(scan.nextLine());
				System.out.printf("������� �������ּ��� :");
				int bno = Integer.parseInt(scan.nextLine());
				
				m1.operate(inputMoney, bno);
			
				}else if(cmd == 2) {
					System.out.print("�߰��� ����� �̸� :");
					String name = scan.nextLine();
					System.out.print("�߰��� ����� ���� :");
					int price = Integer.parseInt(scan.nextLine());
					
					Beverage beverage = new Beverage("����", 900);
					m1.addBeverage(beverage);
					
				}else if (cmd == 3 ) {
					m1.printBeverageList();
		 	}
		}

	}
}
