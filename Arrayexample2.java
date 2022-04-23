package xacxsdas;

public class Arrayexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열
		//많은 데이터를 수월하게 처리하기 위함

		int[] intArr = new int[100]; //배열을 마드는 일반적인 방법
		System.out.println(intArr[99]);
	
		String[] strArr = new String[10];
		
		System.out.println(strArr[0]);
		
		
		//수정 
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);

		strArr[1] = "byebye";
		strArr[2] = "hahahaa";
		
		
		// 일괄 조회  ==> 배열 거의 반드시 반복이랑 같이 사용된다.
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		for (int i = 0; i < 10; ) {
			System.out.println(strArr[i]);
		}
		
		//배열은 길이 정보를 제공합니다. 
		System.out.println(strArr.length);
		System.out.println(intArr.length);

			

	}

}
