package aaaaa;

public class bbbb {
	
	Static int a = 10; // 공유 목적은 아니더라도 Static을 붙여야만 사용할 수 있다. 
	
	public static void test() { //정적 메소드 
		
	}
	
	public static void test2() { //인스턴드 메소드2
		
	}
	public static void main(String[] args) {
		//게시물 데이터가 분리되어 있어 관리하기가 어렵습니다. 하나의 게시물을 표현하는 여러 데이터를 묶어서 구조화 해주세요.
		//힌트 : class와 객체를 생각해주세요.
		//또한 핵심 로직이 main 메서드 안에 작성되어 static이 붙게 되므로 핵심로직을 따로 클래스로 빼서 작성해주세요
		
		Test t1 = new Test();
		Test t2 = new Test();

		t1.num = 100;
		
		System.out.println(t1.num);
		System.out.println(t2.num);

		t2.num = 200;
		System.out.println(t2.num);

		
		

		
		System.out.println(t1.num2);
		System.out.println(t2.num2);
		
		t1.num2 = 50;
		
		System.out.println(t2.num2);

		// age, name이 static 변수이면 세사람이 나이와 이름을 공유하게 됨. static 쓰면안됨.

		Person p1 = new Person();
		p1.age = 20;
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.age = 30;
		p2.name = "이순신";
		
		Person p3 = new Person();
		p3.age = 40;
		p3.name = "강감찬";
		
		System.out.println(p3.age);
		System.out.println(p1.age);
		
		

	}
		
}
//일반적으로 class는 static을 사용하지 않는다.
//static은 non-static을 참조 할 수 없다. (메모리 로드 시점이 일치 하지 않음.)
class Test {
	int num = 10; // 인스턴스(객체)변수 -> 여러 복사본들이 들고있는 변수. 
	static int num2 = 20;  // 정적변수 -> 자바 메모리상에 단 하나만 존재. 객체들의 공유 자원
}
	

class Person{
	int age; //인스턴스 변수 
	String name;//인스턴스 변수 (복사를 해야 만들어진다)
	
	public static void introduce() {
		System.out.println("age");
		System.out.println("name");
		System.out.println("============================");

	}
	public static void introduce2() {
		System.out.println("age");
		System.out.println("name");
		System.out.println("============================");
	
	}
}

