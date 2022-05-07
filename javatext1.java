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
		
		//객체 생성(선언)
		
		Person p3 = new Person();
		p3.setData(30, "이순신", "청주");
		//초기화 (필수)
		
		System.out.println(p3.name);
		
		person p4 = new person();
		p4.setData(20, "황진이", "춘천");
		
		System.out.println(p4.name);
		
		new Person();
		
	}

		
}
//양식,템플릿, 폼	

class person {
	static int age; //static은 원본에 적는 것 / static이 붙지 않은 것 => 복사본에 적는 것 
	 String name;
	 String home;
	 
	 
	 //1.리턴타입 x
	 //2.반드시 클래스명과 동일해야함. 
	 //3.객체가 생성될때 반드시 실행되는 매서드 -> 생성자 
	 
	 public person() {
			System.out.println("사람이 한명이 생성됩니다. ");

	 }
	 
	 public void setData(int data1, String data2, String data3) {
		 
		 age = data1;
		 name = data2;
	 }
}
	


