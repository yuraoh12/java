package xacxsdas;

public class Customer {
	int age;
	String name;
	String address;
	//�������� Ư¡�� void�� return Ÿ���� ����
	
	public Customer(int data1, String data2, String data3) {
		age = data1;
		name = data2;
		address = data3;
		
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printNameAndAge() {
		System.out.println(age);
		printName();
	}
	
}

