package xacxsdas;

public class asdadsad {

	
	public static gugu(int dan) {	
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan , i , dan * i);
		}
	}
	public static void main(String[] args) {

		  // Scanner�� �̿��� �Է°��� �޾�
	    // �������� ���ϴ� ���� ������ ���ּ���.

	    //����) ���ϴ� ���� �Է����ּ��� : 4 (�Է��� ����)

	    // 4�� ���.
		
		
		Scanner scan = new Scanner(System.in);
		
		
		//�ݺ� ������ ���ָ� ���� �ݺ��� �ϱ���~
		//�ݺ����� �߰��� �����ϴ� ����� �˾ƾ� �Ѵ�. 
		for(int i = 0 ; i <10; i ++) {
			System.out.printf("���ϴ� ���� �Է����ּ��� (����� 0)");
			int dan = Integer.parseInt(scan.nextLine());
			
			
			if(dan == 0) {
				System.out.println("������ ���α׷��� �����մϴ�.");
				break;
			}
			
			gugu(dan);
			
		
		
		}
	  		
		
		
	}

}
