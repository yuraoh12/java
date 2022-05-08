package xacxsdas;

public class sol1 {

	public static void main(String[] args) {

		Customer c1 = new Customer(36, "김짱구", "대전");
		Customer c2 = new Customer(29, "손흥민", "런던");
		Customer c3 = new Customer(26, "홍길동", "서울");
		Customer c4 = new Customer(44, "김서방", "대전");
		
		Customer[] customers = {c1, c2, c3, c4};
		
		for(int i = 0; i < customers.length; i++) {
		Customer c = customers[i];  //반복문에서 i를 꺼내온다. 
		c.printNameAndAge();

		}
		
		// 1. 전체 회원의 나이와 이름 출력. 
		
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];  //반복문에서 i를 꺼내온다. 
			c.printNameAndAge();
			System.out.println("==============");
	
		}
		//2. 나이가 30세 미만인 사람의 이름 출력
		for(int i = 0; i < customers.length; i++) {
				Customer c = customers[i];

			if(c.age < 30) {
				c.printName();
				System.out.println("==============");
				

			}
		}

		
		//3. 대전 사는 사람들의 이름과 나이 출력.
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];
			
			if(c.address == "대전") {
				c.printNameAndAge();
				System.out.println("==============");
				
				
			}
		}
		
		//4. 김씨 성을 가진 사람 이름 출력. 
		//자바 api
		//api -> 여러분이 만든게 아니라 누군가 만들어서 함수나 클래스 모듈 형태로 제공한다. 
//		String str1 = "aabbccdd";
//		if(str1.startsWith("aa")){//true, false
//			System.out.println("aa로 시작합니다.");
//		} else {
//			System.out.println("aa로 시작하지 않습니다.");
//
//		}
		for(int i = 0; i < customers.length; i++) {
			Customer c = customers[i];
			String name = c.name;
			
			if(name.startsWith("김")) {
					c.printName();
			}
			
//			if(customers[i].name.startsWith("김")) {
//				
//			}
		}
		
	}
	
}
	
	

