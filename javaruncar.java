package xacxsdas;


public class javaruncar {
	

  public static void main(String[] args) {

	  
	  
	// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
	// 변수에 객체를 조종할 수 있는 리모콘을 담을 수 있습니다.
	// 그 변수를 이용해 최고속력이 서로 다른 자동차를 만들어주세요.
	// 객체의 리모콘은 new 키워드를 통해 만들 수 있습니다.
//
//	class Main {
//	  public static void main(String[] args) {
//
//	    //객체를 만들 땐 new 키워드를 사용한다.
//	    //자동차 class로 만들어진 자동차 객체 저장하는 변수는 타입이 class와 동일해야 한다.
//	    자동차 자동차1 = new 자동차();
//	    
//	    //자동차1 변수에 첫번째 자동차 객체가 저장된다.
//	    자동차1.최고속력 = 200;
//	    자동차1.run();
//
//	    //자동차2 변수에 두번째 자동차 객체가 저장된다.
//	    자동차 자동차2 = new 자동차();
//	    자동차2.최고속력 = 180;
//	    자동차2.run();
//
//	  }
//	}

	// 자동차 객체는 int 정수 하나를 저장할 수 있다.
	class 자동차 {

	  int 최고속력;
	  
	  void run() {
	    System.out.println(최고속력 + "km로 자동차가 달립니다.");
	  }

	}

	  
	  Car c1 = new Car();
	  c1.maxVelo = 200;
	  
	  Car c2 = new Car();	 
	  c2.maxVelo = 300;
	  
	  Car c3 = new Car();
	  c3.maxVelo = 350;
	  
	  c1.run();
	  c1.run();
	  c1.run();

	  c1.run();
	  c2.run();
	  c3.run();

  
  }
}

// 최대속력 
	
class car{
	int maxVELO;
	
	public void run() {
		System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n", maxVelo);
	}
}