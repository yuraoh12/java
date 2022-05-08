package xacxsdas;

public class javatest2 {
	
	public static void main(String[] args) {
	
		
		//기능1. 음료수 뽑기.
		//기능2. 뽑을수 있는 음료 종류 한개 추가. 
		//기능3. 기본 4종 음료수 채우기 
		VendingMachine m1 = new VendingMachine();
		
		
		m1.init();//기본 4종 음료수 채우기 
		
		Beverage newBeverage = new Beverage("환타", 1100);
		m1.addBeverage(newBeverage);
		
		
		
		String result = m1.operate(1000, 2);
		
		System.out.println(result);
		
		String result2 = m1.operate(1000, 0);
		
		System.out.println(result2);

		String result3 = m1.operate(1100, 4);
		
		System.out.println(result2);
	
	
	}
	
	

}
