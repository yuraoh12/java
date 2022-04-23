package xacxsdas;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열
		//많은 데이터를 수월하게 처리하기 위함
		
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
//변수만 사용하면 데이터가 많아졌을때 관리가 안 됨.
		
		int[] numArr = {10, 20, 30, 40, 50};
		//배열의 경계값을 항상 주의한다. 
		//시작은 0입니다. 
		//끝은 배열의 갯수 = -1임
		System.out.println(numArr[3]); //배열은 순서가 0부터 시작한다. 
	}

}
