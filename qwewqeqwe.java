package xacxsdas;

import java.util.Scanner;

public class qwewqeqwe {
	
	
	public static String vendingMachine(int inputMoney, int bno) {
		
		//���� ��� 
		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("�ܾ��� �����մϴ�.");
			return null;
		}
		
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("�ܾ��� %d�Դϴ�. \n", remainder);

		return beverageNames[bno];
		
	}
//
//	public static void main(String[] args) {
//
//		
//		String beverage = vendingMachine(2000 ,1); // ���⼭ �� 1�� ����� �޴� 1,2,3,4�� �ǹ���. 
//		
//		if(beverage == null ) {
//			System.out.printf("ȫ�浿�� ������� ���� ���߽��ϴ�. ");
//		} else {
//			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.", beverage );
//
//		}
//		
//	}	
//		// ��, ���� �����
//		// 0 : �ݶ�/ 1: ���̴�(1000) / 2: Ŀ��(800) / 3: ����(600) 
//		String beverage = vendingMachine(1000, 3);
//		
//		if(beverage == null ) {
//			System.out.printf("ȫ�浿�� ������� ���� ���߽��ϴ�. ");
//		} else {
//		System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.", "����" );
//		
//	}

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		 
		// ��, ���� ����� 
		// 0 - �ݶ�(1200), 1 - ���̴�(1000), 2 - Ŀ��(800), 3 - ����(600)
		
		String beverage = vendingMachine(2000, 0);
		
		if(beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� ���߽��ϴ�.");
		} else {			
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.", beverage);
		}
		
		System.out.println("================ ����� ��� ==============");
		System.out.println("0 : �ݶ� (1200��)");
		System.out.println("1 : ���̴� (1000��)");
		System.out.println("2 : Ŀ�� (800��)");
		System.out.println("3 : ���� (600��)");
		System.out.println("===============================");
		
		System.out.println("���� �ݾ��� �����Ͻðڽ��ϱ�:");
		int inputMoney = Integer.parseInt(scan.nextLine());
		
		System.out.print("� ������� �����Ͻðڽ��ϱ� :");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		
		
		
		
		
		String beverage2 = vendingMachine(inputMoney, bno);
		
		if(beverage2 == null) {
			System.out.println("ȫ����� ������� ���� ���߽��ϴ�.");
		} else {			
			System.out.printf("ȫ����� %s�� �������� ���ʴϴ�.", beverage2);
		}	
	}
	
}
