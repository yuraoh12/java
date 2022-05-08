package xacxsdas;

public class VendingMachine {
	
	int remainder = 0;
	Beverage[] beverages = new Beverage[10]; // ����� 10���� ������ �� �ִ� ���� �迭�� ����. 
	
	
	//�����Ѵ�. 
	
	
	//���� --> ����. // ������ �Լ����� �ؾ��Ѵ�. Ŭ�������� ������. 
	
	public void init() { // ����� 4�� ŹŹ ä���� �̰� ���� �ؾ߸�;
		
		
		Beverage b1 = new Beverage("�ݶ�", 1200);
		Beverage b2 = new Beverage("���̴�", 1000);
		Beverage b3 = new Beverage("Ŀ��", 800);
		Beverage b4 = new Beverage("����", 600);
		
		
		beverage[0] = b1;
		beverage[1] = b2;
		beverage[2] = b3;
		beverage[3] = b4;
	
	}
	
	public void addBeverage(Beverage beverage) {
		
		
		// 1. beverages �迭�� ���̴� 4�̴�. ������ �ε����� 3�̴�. 
		beverage[4]= beverage;
	}
	
	public String operate(int inputMoney, int bno) {
			// ���� ���
		
		
		Beverage target = beverages[bno];
			
//			String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
//			int[] beveragePrices = {1200, 1000, 800, 600};
			
			System.out.printf("���� �ݾ��� %d�Դϴ�.\n", inputMoney);
			remainder = remainder + inputMoney;
			
			
			if(remainder < target.price) {
				System.out.println("�ܾ��� �����մϴ�.");
				return null;
			}
			
			System.out.printf("%s�� �����̽��ϴ�.\n", target.name);
			
			remainder = remainder - target.price;
			
			System.out.printf("�ܾ��� %d�Դϴ�.\n", remainder);
			
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