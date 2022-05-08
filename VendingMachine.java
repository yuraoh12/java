package xacxsdas;

public class VendingMachine {
	
	int remainder = 0;
	Beverage[] beverages = new Beverage[10]; // ����� 10���� ������ �� �ִ� ���� �迭�� ����. 
	int count = 4;
	
	
	//�����Ѵ�. 
	
	
	//���� --> ����. // ������ �Լ����� �ؾ��Ѵ�. Ŭ�������� ������. 
	
	public void init() { // ����� 4�� ŹŹ ä���� �̰� ���� �ؾ߸�;
		
		
		Beverage b1 = new Beverage("�ݶ�", 1200);
		Beverage b2 = new Beverage("���̴�", 1000);
		Beverage b3 = new Beverage("Ŀ��", 800);
		Beverage b4 = new Beverage("����", 600);
		
		
		beverages[0] = b1;
		beverages[1] = b2;
		beverages[2] = b3;
		beverages[3] = b4;
	
	}
	
	public void printBeverageList() {
		System.out.println("=========����� ���============");
		for(int i = 0; i < count; i ++) {
			Beverage b = beverages[i];
			System.out.printf("%d, %s : %d\n", i , b.name, b.price );
			
		}
		System.out.println("=========����� ���============");

	}	
	
	public void addBeverage(Beverage beverage) {
		// 1. beverages �迭�� ���̴� 4�̴�. ������ �ε����� 3�̴�. 
		beverages[count]= beverage;
		count ++;
		
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