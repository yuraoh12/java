package xacxsdas;

public class zzzzzzz {

	static int remainder = 0; //�ܾ�
	
	
	public static void deposit(int money) {
		
		int remainder += money;
		System.out.printf("%d���� �����ϼ̽��ϴ�.\n", money);
		System.out.printf("�ܾ��� %d���Դϴ�.\n", remainder);
		
		
	}		

	
	public static int withdraw(int money) {
		System.out.printf("%d���� ����ϼ̽��ϴ�\n", money);
		remainder -= money;
		System.out.printf("%d���� ����ϼ̽��ϴ�\n", remainder);
		return money;

	}
	
	public static void main(String[] args) {

		
		deposit(1000); //����
		deposit(2000); //����
		deposit(3000); //����
	int money =	withdraw(400); //��� 
	System.out.println(money);
	
	money = withdraw(1400); //���
	System.out.println(money);

	}

}
