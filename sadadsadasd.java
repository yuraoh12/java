package xacxsdas;

public class sadadsadasd {
	
	public static void introduce(int age, String name) {
		System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);

	}

	public static void main(String[] args) {

		
		//사람 
		// 나이 , 이름
		
		// 22살 홍길동
		int age = 22;
		String name = "홍길동";
		
		// 자기소개 
		introduce(age, name);
		
		
		
		// 33살 이순신
		int age2 = 33;
		String name2 = "이순신";
		
		// 자기소개 
		introduce(age, name2);
		introduce(age2, name);				
	}

}
