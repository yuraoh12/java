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
		


	}

		
}
//���,���ø�, ��	

class person {
	static int age; //static�� ������ ���� �� / static�� ���� ���� �� => ���纻�� ���� �� 
	static String name;
	static String home;
}
	


