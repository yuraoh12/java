package xacxsdas;

public class javatext1 {

	public static void main(String[] args) {
		Person p1 = new Person() ; //new person() => person �Ѱ� ��������
		
		p1.age = 20;
		p1.name = "ȫ�浿";
		p1.home = "����";
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.home);

		Person p2 = new Person() ; 
		
		p2.age = 30;
		p2.name = "ȫ���";
		p2.home = "����";
		
//		pesron2 p2 = new Person2();
		System.out.println(p2.age);
		System.out.println(p2.name);
		System.out.println(p2.home);
		
		//��ü ����(����)
		
		Person p3 = new Person();
		p3.setData(30, "�̼���", "û��");
		//�ʱ�ȭ (�ʼ�)
		
		System.out.println(p3.name);
		
		person p4 = new person();
		p4.setData(20, "Ȳ����", "��õ");
		
		System.out.println(p4.name);
		
		new Person();
		
	}

		
}
//���,���ø�, ��	

class person {
	static int age; //static�� ������ ���� �� / static�� ���� ���� �� => ���纻�� ���� �� 
	 String name;
	 String home;
	 
	 
	 //1.����Ÿ�� x
	 //2.�ݵ�� Ŭ������� �����ؾ���. 
	 //3.��ü�� �����ɶ� �ݵ�� ����Ǵ� �ż��� -> ������ 
	 
	 public person() {
			System.out.println("����� �Ѹ��� �����˴ϴ�. ");

	 }
	 
	 public void setData(int data1, String data2, String data3) {
		 
		 age = data1;
		 name = data2;
	 }
}
	


