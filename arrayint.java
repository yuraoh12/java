package day05;
import java.util.ArrayList;

public class arrayint {
	public static void main(String[] args) {
		//�迭�� ������ �����ϰ� ���ϰ� ��� ������ ���� ���� ���� =>ArrayList
		//ArrayList =>JavaAPI, �迭�� Ȯ��, ���� ���� ���� ����� ó�� �Ѵ�. 
		//int[]arr = new int[3];
		
		
		//�⺻Ÿ�� -> int, float, double, boolean (������)
		
		//��üŸ�� -> �⺻Ÿ���� ������ ���� (������)
		
		// Arraylist<�ڷ���> = > ������ ��üŸ��
		// �⺻Ÿ���� ��üŸ�� ==> ����Ŭ����
		
		//int => integer
		//double => Double
		
		//int num1 =10;
		//��ü�� ������ �����̰� �������̴�. 
		
		ArrayList<int> list = new ArrayList<int>();
//		list.add(3);
//		list.get("aaa");
//		list.remove(3.14);
		
		list.add(3);
		list.add(4);		
		list.add(5);

		int rst = list.get(1);
		
		System.out.println(rst);
		
		
		//CRUD => �������� �߰�,��ȸ,����,���� 
	// CREATE  add�߰�, Read = > ��ȸ(get), UPDATE =>���� set, delete ���� remove , Size => �������� ���� 
		int rst2 = list.get(0);
		System.out.println(rst2);
		
		
		list.add(1);
		list.set(0,1); //0��°�� 1��°�� �ٲٰ� �ʹ�. 
		
		
		rst2.list.get(0);
		System.out.println(rst2);
		
		list.remove(1);
 //{1,4,5} => {1,5}
		rst3 = list.get(1);
		System.out.println(rst3);
				
		int size = list.size();
		System.out.println(size);
		
		//list.add(10)
		//��ü���
		for(int i = 0 ; list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
	}
}

//class ArrayList {
//	int[]arr = new int[10];
//	int size = 0;
//	
//	void add() {
//	}
//	
//	void get(0) {
//		
//	}
//	void remove(1) {
//		
//	}
//}	