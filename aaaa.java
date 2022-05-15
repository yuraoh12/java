package aaaaa;

import java.util.ArrayList;
import java.util.Scanner;

	public static void main(String[] args) {

		public class Main {
			//������ ���ش�. ����ƽ ������ �ٿ��ش�. 
			static ArrayList<String> titles = new ArrayList<>();
			static ArrayList<String> bodies = new ArrayList<>();

			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				while (true) {
					System.out.print(">> ");
					String cmd = sc.nextLine();

					if (cmd.equals("help")) {
						System.out.println("���� ���");
						System.out.println("add  : �Խù� ���");
						System.out.println("list : �Խù� ���");
						System.out.println("eixt : ���α׷� ����");

					} else if (cmd.equals("exit")) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					} 

					} else if(cmd.equals("add")) {
						System.out.print("���� :");
						String title = sc.nextLine();
						titles.add(title); // [aaa, ccc, eee]

						System.out.print("���� :");
						String body = sc.nextLine();
						bodies.add(body); //[bbb, ddd, fff]

						System.out.println("�Խù��� ����Ǿ����ϴ�.");

					} else if(cmd.equals("list")) {
						// list ��ü ���
						for(int i = 0; i < titles.size(); i++) {
							String title = titles.get(i);
							String body = bodies.get(i);
							System.out.printf("��ȣ: %d\n", i + 1);
							System.out.printf("����: %s\n", title);
							System.out.printf("����: %s\n", body);			
							System.out.println("==========================");
						}
					}else if(cmd.equals("update")){
						
						//CRUD
					}
						System.out.print("������ �Խù� ��ȣ :");
						int no = Integer.parseInt(sc.nextLine());
						int index = no -1 ;
						
						//.������ �ε��� = size-1
						if(index < 0 || index >= titles.size()) {
							System.out.println("���°Խù��Դϴ�.");
							continue;
							
							
						}
						
						System.out.print("������:");
						String title = sc.nextLine();
						System.out.print("������:");
						String body = sc.nextLine();
						
						titles.set(index, title);
						bodies.set(index, body);			
					
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						printArticles();
					
					} else {
						System.out.println("�� �� ���� ��ɾ��Դϴ�.");
					}
			}
	}
	public static void printArticles() {
		// list ��ü ���
		for(int i = 0; i < titles.size(); i++) {
			String title = titles.get(i);
			String body = bodies.get(i);
			System.out.printf("��ȣ: %d\n", i + 1);
			System.out.printf("����: %s\n", title);			
			System.out.println("==========================");
			}
		}
}
