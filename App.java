
		
		package xacxsdas;

		import java.util.ArrayList;
		import java.util.Scanner;

		public class App {
			
			ArrayList<Member> members = new ArrayList<>();
			ArticleController ac = new ArticleController();
			MemberController mc = new MemberController();
			Scanner sc = new Scanner(System.in);
			
			
			public void start() {
				Scanner sc = new Scanner(System.in);	
				
				while (true) {
					
					Member loginedMember = mc.getLoginedMember();
					ac.setLoginedMember(loginedMember);
					
					if (loginedMember == null) {
						System.out.print("��ɾ �Է����ּ��� : ");
					} else {
						System.out.print(
								"��ɾ �Է����ּ��� [" + loginedMember.getLoginId() + "(" + loginedMember.getNickname() + ")] : ");
					}
					String cmd = sc.nextLine();
					
					if (cmd.equals("exit")) {
						System.out.println("����");
						break;
					}
					
					String[] cmdBits = cmd.split(" ");
					
					if(cmdBits.length < 2) {
						System.out.println("�߸��� ��ɾ��Դϴ�.");
						continue;
					}
					String module = cmdBits[0]; // article
				    String func = cmdBits[1]; // list add
				    
					if(module.equals("article")) {
						ac.doCommand(func);				
					} else if(module.equals("member")) {				
						mc.doCommand(func);
					}
				}
	}

}
