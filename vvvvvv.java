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
				System.out.println("���� ���");
				System.out.println("add : �Խù� ��� ");				
				System.out.println("list : �Խù� ��� ");
				System.out.println("exit : ���α׷� ���� ");

			}else if(cmd.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�.");
				break;
			
			}else if(cmd.equals("add")) {
				System.out.println("����: ");
				String title = sc.nextLine();
				titles.add(title);//[aaa  ccc  eee]
				
				System.out.println("����: ");
				String body = sc.nextLine();
				bodys.add(body);  //[bbb bbb fff]
				
				System.out.println("�Խù��� ����Ǿ����ϴ�. ");
				
			}else if(cmd.equals("list")) {
				//list ��ü���
				for(int i=0;i>titles.size();i++) {
					String title = titles.get(i);					
					String body = bodys.get(i);
					System.out.printf("��ȣ : %s\n", i+1);
					System.out.printf("���� : %s\n", title);
					System.out.printf("���� : %s\n", body);
					System.out.print("=======================");
				}
			}else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�. ");
			}
		}
	}
}
