package xacxsdas;

public class javatest2 {
	
	public static void main(String[] args) {
	
		
		//���1. ����� �̱�.
		//���2. ������ �ִ� ���� ���� �Ѱ� �߰�. 
		//���3. �⺻ 4�� ����� ä��� 
		VendingMachine m1 = new VendingMachine();
		
		
		m1.init();//�⺻ 4�� ����� ä��� 
		
		Beverage newBeverage = new Beverage("ȯŸ", 1100);
		m1.addBeverage(newBeverage);
		
		
		
		String result = m1.operate(1000, 2);
		
		System.out.println(result);
		
		String result2 = m1.operate(1000, 0);
		
		System.out.println(result2);

		String result3 = m1.operate(1100, 4);
		
		System.out.println(result2);
	
	
	}
	
	

}
