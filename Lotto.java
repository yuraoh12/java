package day06;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int[] myChooseNums = new int[6]; // ���� ������ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        // ** �ߺ��� ��ȣ�� ����� ��.
        for(int i = 0;i<length; i++) {
        	lottoNums[i] = random.nextInt(44) + 1;
        	//�ߺ� üũ
        	for(int j = 0;j<i;j++) {
        		if(lottoNums[i] == lottoNums[j]) {
        			i--;
        			break;
        		}
        	}
        }
        
        // 2.�Է��� ���� �������� ��ȣ �����ϴ� �ڵ� �ۼ����ּ���. 6�� ��ȣ �ߺ� ���� �迭�� ����
        for(int i = 0; i < length - 1; i++) {
        	System.out.printf("%d��° ��ȣ�� �Է����ּ��� :", i + 1);
        	myChooseNums[i] = Integer.parseInt(sc.nextLine());
        	
        	//�ߺ�üũ
        	for(int j = 0; j < i; j++) {
        		if(myChooseNums[i] == myChooseNums[j]) {
        			i--;
        			System.out.println("�ߺ����� �Է��� �ּ���");
        			break;
        		}
        	}
        }
        
        System.out.print("����� ������ ��ȣ�� : ");
        for(int i = 0; i < length - 1; i++) {
        	System.out.print(myChooseNums[i] + " ");
        }
        // ��°��
        // ����� ������ ��ȣ�� : 3 12 19 23 36 41
        
        // 1 ��� �ڵ�
        System.out.println();
        System.out.print("���õ� �ζ� ��ȣ : ");
        for(int i = 0; i < length - 1; i++) {
        	System.out.print(lottoNums[i] + " ");
        }
        System.out.println(", ���ʽ� ��ȣ : " + lottoNums[length - 1]);
        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36
        
        
        
        // 3. ���� ������ ��ȣ�� ��÷ ��ȣ�� �����Ͽ� ��÷Ȯ���ϴ� �ڵ带 �ۼ����ּ���. (���� ��ȣ ���� ����) 
        int matchCount = 0;
        boolean isExistBonusNum = false;
        for(int i = 0; i < length - 1; i++) {
        	for(int j = 0; j < length - 1; j++) {
        		if(lottoNums[i] == myChooseNums[j]) {
        			matchCount++;
        			break;//�´°� �ִٸ� ���������� ������ ��
        		}else if(myChooseNums[j] == lottoNums[6] && !isExistBonusNum) {//���ʽ� ��ȣ
        			isExistBonusNum = true;
        			break;
        			
        		}
        	}
        }
        
        //4. ��÷ ����� ������ּ���.
        if(matchCount == 6) {
        	System.out.println("1�� ��÷");
        }else if(matchCount == 5 && isExistBonusNum) {
        	System.out.println("2�� ��÷");
        }else if(matchCount == 5) {
        	System.out.println("3�� ��÷");
        }else if(matchCount == 4) {
        	System.out.println("4�� ��÷");
        }else if(matchCount == 3) {
            System.out.println("5�� ��÷");
        }else {
        	System.out.println("��");
        }
    }
}
