package zzz;

import java.util.ArrayList;
import java.util.Scanner;

class vvvvvv {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodys = new ArrayList<>();

		while (true) {
			System.out.println(">>");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("도움말 기능");
				System.out.println("add : 게시물 등록 ");				
				System.out.println("list : 게시물 목록 ");
				System.out.println("exit : 프로그램 종료 ");

			}else if(cmd.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
				break;
			
			}else if(cmd.equals("add")) {
				System.out.println("제목: ");
				String title = sc.nextLine();
				titles.add(title);//[aaa  ccc  eee]
				
				System.out.println("내용: ");
				String body = sc.nextLine();
				bodys.add(body);  //[bbb bbb fff]
				
				System.out.println("게시물이 저장되었습니다. ");
				
			}else if(cmd.equals("list")) {
				//list 전체출력
				for(int i=0;i>titles.size();i++) {
					String title = titles.get(i);					
					String body = bodys.get(i);
					System.out.printf("번호 : %s\n", i+1);
					System.out.printf("제목 : %s\n", title);
					System.out.printf("내용 : %s\n", body);
					System.out.print("=======================");
				}
			}else {
				System.out.println("알 수 없는 명령어입니다. ");
			}
		}
	}
}
