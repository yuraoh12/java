package xacxsdas;

public class sol1 {

	public static void main(String[] args) {

		Customer c1 = new Customer(36, "��¯��", "����");
		Customer c2 = new Customer(29, "�����", "����");
		Customer c3 = new Customer(26, "ȫ�浿", "����");
		Customer c4 = new Customer(44, "�輭��", "����");
		
		Customer[] customers = {c1, c2, c3, c4};
		
		for(int i = 0; i < customers.length; i++) {
		Customer c = customers[i];  //�ݺ������� i�� �����´�. 
		c.printNameAndAge();

		}
		
		// 1. ��ü ȸ���� ���̿� �̸� ���. 
		
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];  //�ݺ������� i�� �����´�. 
			c.printNameAndAge();
			System.out.println("==============");
	
		}
		//2. ���̰� 30�� �̸��� ����� �̸� ���
		for(int i = 0; i < customers.length; i++) {
				Customer c = customers[i];

			if(c.age < 30) {
				c.printName();
				System.out.println("==============");
				

			}
		}

		
		//3. ���� ��� ������� �̸��� ���� ���.
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];
			
			if(c.address == "����") {
				c.printNameAndAge();
				System.out.println("==============");
				
				
			}
		}
		
		//4. �达 ���� ���� ��� �̸� ���. 
		//�ڹ� api
		//api -> �������� ����� �ƴ϶� ������ ���� �Լ��� Ŭ���� ��� ���·� �����Ѵ�. 
//		String str1 = "aabbccdd";
//		if(str1.startsWith("aa")){//true, false
//			System.out.println("aa�� �����մϴ�.");
//		} else {
//			System.out.println("aa�� �������� �ʽ��ϴ�.");
//
//		}
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];
			String name = c.name;
			
			if(name.startsWith("��")) {
					c.printName();
			}
			
//			if(customers[i].name.startsWith("��")) {
//				
//			}
		}
		
	}
	
}
	
	

