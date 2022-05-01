package xacxsdas;

public class asdadsad {

	
	public static gugu(int dan) {	
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan , i , dan * i);
		}
	}
	public static void main(String[] args) {

		  // Scanner를 이용해 입력값을 받아
	    // 구구단을 원하는 단이 나오게 해주세요.

	    //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

	    // 4단 출력.
		
		
		Scanner scan = new Scanner(System.in);
		
		
		//반복 조건을 없애면 무한 반복을 하구요~
		//반복문을 중간에 종료하는 방법을 알아야 한다. 
		for(int i = 0 ; i <10; i ++) {
			System.out.printf("원하는 단을 입력해주세요 (종료는 0)");
			int dan = Integer.parseInt(scan.nextLine());
			
			
			if(dan == 0) {
				System.out.println("구구단 프로그램을 종료합니다.");
				break;
			}
			
			gugu(dan);
			
		
		
		}
	  		
		
		
	}

}
