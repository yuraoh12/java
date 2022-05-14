package day05;
import java.util.ArrayList;

public class arrayint {
	public static void main(String[] args) {
		//배열의 단점을 보완하고 편리하게 사용 가능한 저장 구조 제공 =>ArrayList
		//ArrayList =>JavaAPI, 배열의 확장, 삭제 갯수 관리 등등을 처리 한다. 
		//int[]arr = new int[3];
		
		
		//기본타입 -> int, float, double, boolean (빨간색)
		
		//객체타입 -> 기본타입을 제외한 모든것 (검은색)
		
		// Arraylist<자료형> = > 무조건 객체타입
		// 기본타입의 객체타입 ==> 래퍼클래스
		
		//int => integer
		//double => Double
		
		//int num1 =10;
		//객체는 포인터 개념이고 참조형이다. 
		
		ArrayList<int> list = new ArrayList<int>();
//		list.add(3);
//		list.get("aaa");
//		list.remove(3.14);
		
		list.add(3);
		list.add(4);		
		list.add(5);

		int rst = list.get(1);
		
		System.out.println(rst);
		
		
		//CRUD => 데이터의 추가,조회,수정,삭제 
	// CREATE  add추가, Read = > 조회(get), UPDATE =>수정 set, delete 삭제 remove , Size => 데이터의 갯수 
		int rst2 = list.get(0);
		System.out.println(rst2);
		
		
		list.add(1);
		list.set(0,1); //0번째를 1번째로 바꾸고 싶다. 
		
		
		rst2.list.get(0);
		System.out.println(rst2);
		
		list.remove(1);
 //{1,4,5} => {1,5}
		rst3 = list.get(1);
		System.out.println(rst3);
				
		int size = list.size();
		System.out.println(size);
		
		//list.add(10)
		//전체출력
		for(int i = 0 ; list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
	}
}

//class ArrayList {
//	int[]arr = new int[10];
//	int size = 0;
//	
//	void add() {
//	}
//	
//	void get(0) {
//		
//	}
//	void remove(1) {
//		
//	}
//}	