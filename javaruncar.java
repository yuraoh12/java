package xacxsdas;


public class javaruncar {
	

  public static void main(String[] args) {

	  
	  
	// ���� : �ڵ��� ��ü�� ���� ������ ������ּ���.
	// ������ ��ü�� ������ �� �ִ� �������� ���� �� �ֽ��ϴ�.
	// �� ������ �̿��� �ְ�ӷ��� ���� �ٸ� �ڵ����� ������ּ���.
	// ��ü�� �������� new Ű���带 ���� ���� �� �ֽ��ϴ�.
//
//	class Main {
//	  public static void main(String[] args) {
//
//	    //��ü�� ���� �� new Ű���带 ����Ѵ�.
//	    //�ڵ��� class�� ������� �ڵ��� ��ü �����ϴ� ������ Ÿ���� class�� �����ؾ� �Ѵ�.
//	    �ڵ��� �ڵ���1 = new �ڵ���();
//	    
//	    //�ڵ���1 ������ ù��° �ڵ��� ��ü�� ����ȴ�.
//	    �ڵ���1.�ְ�ӷ� = 200;
//	    �ڵ���1.run();
//
//	    //�ڵ���2 ������ �ι�° �ڵ��� ��ü�� ����ȴ�.
//	    �ڵ��� �ڵ���2 = new �ڵ���();
//	    �ڵ���2.�ְ�ӷ� = 180;
//	    �ڵ���2.run();
//
//	  }
//	}

	// �ڵ��� ��ü�� int ���� �ϳ��� ������ �� �ִ�.
	class �ڵ��� {

	  int �ְ�ӷ�;
	  
	  void run() {
	    System.out.println(�ְ�ӷ� + "km�� �ڵ����� �޸��ϴ�.");
	  }

	}

	  
	  Car c1 = new Car();
	  c1.maxVelo = 200;
	  
	  Car c2 = new Car();	 
	  c2.maxVelo = 300;
	  
	  Car c3 = new Car();
	  c3.maxVelo = 350;
	  
	  c1.run();
	  c1.run();
	  c1.run();

	  c1.run();
	  c2.run();
	  c3.run();

  
  }
}

// �ִ�ӷ� 
	
class car{
	int maxVELO;
	
	public void run() {
		System.out.printf("�ڵ����� �ִ�ӷ� %dkm�� �޸��ϴ�.\n", maxVelo);
	}
}