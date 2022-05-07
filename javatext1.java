package xacxsdas;

public class javatext1 {

	public static void main(String[] args) {
		Person p1 = new Person() ; //new person() => person 한개 복사해줘
		
		p1.age = 20;
		p1.name = "홍길동";
		p1.home = "대전";
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.home);

		Person p2 = new Person() ; 
		
		p2.age = 30;
		p2.name = "홍길순";
		p2.home = "서울";
		
//		pesron2 p2 = new Person2();
		System.out.println(p2.age);
		System.out.println(p2.name);
		System.out.println(p2.home);
		


	}

		
}
//양식,템플릿, 폼	

class person {
	static int age; //static은 원본에 적는 것 / static이 붙지 않은 것 => 복사본에 적는 것 
	static String name;
	static String home;
}
	


