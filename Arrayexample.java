package xacxsdas;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭
		//���� �����͸� �����ϰ� ó���ϱ� ����
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 10;
		int num5 = 10;

		int num = 0;
		for(int i =1; i <=5; i++) {
			System.out.println(num + i);
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
//������ ����ϸ� �����Ͱ� ���������� ������ �� ��.
		
		int[] numArr = {10, 20, 30, 40, 50};
		//�迭�� ��谪�� �׻� �����Ѵ�. 
		//������ 0�Դϴ�. 
		//���� �迭�� ���� = -1��
		System.out.println(numArr[3]); //�迭�� ������ 0���� �����Ѵ�. 
	}

}
