package xacxsdas;

public class Arrayexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭
		//���� �����͸� �����ϰ� ó���ϱ� ����

		int[] intArr = new int[100]; //�迭�� ����� �Ϲ����� ���
		System.out.println(intArr[99]);
	
		String[] strArr = new String[10];
		
		System.out.println(strArr[0]);
		
		
		//���� 
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);

		strArr[1] = "byebye";
		strArr[2] = "hahahaa";
		
		
		// �ϰ� ��ȸ  ==> �迭 ���� �ݵ�� �ݺ��̶� ���� ���ȴ�.
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		for (int i = 0; i < 10; ) {
			System.out.println(strArr[i]);
		}
		
		//�迭�� ���� ������ �����մϴ�. 
		System.out.println(strArr.length);
		System.out.println(intArr.length);

			

	}

}
