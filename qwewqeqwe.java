package xacxsdas;

public class qwewqeqwe {
	
	
	public static String vendingMachine(int inputMoney, int bno) {
		
		//���� ��� 
		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("�ܾ��� �����մϴ�.");
			return null;
		}
		return beverageNames[bno];
		
	}

	public static void main(String[] args) {

		// ��, ���� �����
		// 0 : �ݶ�/ 1: ���̴�(1000) / 2: Ŀ��(800) / 3: ����(600) 
		String beverage = vendingMachine(1000, 0);
		
		System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.", "����" );
		
	}

}
