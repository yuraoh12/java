package aaaaa;

public class bbbb {
	
	Static int a = 10; // ���� ������ �ƴϴ��� Static�� �ٿ��߸� ����� �� �ִ�. 
	
	public static void test() { //���� �޼ҵ� 
		
	}
	
	public static void test2() { //�ν��ϵ� �޼ҵ�2
		
	}
	public static void main(String[] args) {
		//�Խù� �����Ͱ� �и��Ǿ� �־� �����ϱⰡ ��ƽ��ϴ�. �ϳ��� �Խù��� ǥ���ϴ� ���� �����͸� ��� ����ȭ ���ּ���.
		//��Ʈ : class�� ��ü�� �������ּ���.
		//���� �ٽ� ������ main �޼��� �ȿ� �ۼ��Ǿ� static�� �ٰ� �ǹǷ� �ٽɷ����� ���� Ŭ������ ���� �ۼ����ּ���
		
		Test t1 = new Test();
		Test t2 = new Test();

		t1.num = 100;
		
		System.out.println(t1.num);
		System.out.println(t2.num);

		t2.num = 200;
		System.out.println(t2.num);

		
		

		
		System.out.println(t1.num2);
		System.out.println(t2.num2);
		
		t1.num2 = 50;
		
		System.out.println(t2.num2);

		// age, name�� static �����̸� ������� ���̿� �̸��� �����ϰ� ��. static ����ȵ�.

		Person p1 = new Person();
		p1.age = 20;
		p1.name = "ȫ�浿";
		
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "�̼���";
		
		Person p3 = new Person();
		p3.age = 40;
		p3.name = "������";
		
		System.out.println(p3.age);
		System.out.println(p1.age);
		
		

	}
		
}
//�Ϲ������� class�� static�� ������� �ʴ´�.
//static�� non-static�� ���� �� �� ����. (�޸� �ε� ������ ��ġ ���� ����.)
class Test {
	int num = 10; // �ν��Ͻ�(��ü)���� -> ���� ���纻���� ����ִ� ����. 
	static int num2 = 20;  // �������� -> �ڹ� �޸𸮻� �� �ϳ��� ����. ��ü���� ���� �ڿ�
}
	

class Person{
	int age; //�ν��Ͻ� ���� 
	String name;//�ν��Ͻ� ���� (���縦 �ؾ� ���������)
	
	public static void introduce() {
		System.out.println("age");
		System.out.println("name");
		System.out.println("============================");

	}
	public static void introduce2() {
		System.out.println("age");
		System.out.println("name");
		System.out.println("============================");
	
	}
}

