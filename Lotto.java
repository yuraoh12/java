package day06;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1등 당첨 번호
        int[] myChooseNums = new int[6]; // 내가 선택한 번호
        int length = lottoNums.length;

        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
        // ** 중복된 번호는 없어야 됨.
        for(int i = 0;i<length; i++) {
        	lottoNums[i] = random.nextInt(44) + 1;
        	//중복 체크
        	for(int j = 0;j<i;j++) {
        		if(lottoNums[i] == lottoNums[j]) {
        			i--;
        			break;
        		}
        	}
        }
        
        // 2.입력을 통해 수동으로 번호 선택하는 코드 작성해주세요. 6개 번호 중복 없이 배열에 저장
        for(int i = 0; i < length - 1; i++) {
        	System.out.printf("%d번째 번호를 입력해주세요 :", i + 1);
        	myChooseNums[i] = Integer.parseInt(sc.nextLine());
        	
        	//중복체크
        	for(int j = 0; j < i; j++) {
        		if(myChooseNums[i] == myChooseNums[j]) {
        			i--;
        			System.out.println("중복없이 입력해 주세요");
        			break;
        		}
        	}
        }
        
        System.out.print("당신이 선택한 번호는 : ");
        for(int i = 0; i < length - 1; i++) {
        	System.out.print(myChooseNums[i] + " ");
        }
        // 출력결과
        // 당신이 선택한 번호는 : 3 12 19 23 36 41
        
        // 1 출력 코드
        System.out.println();
        System.out.print("선택된 로또 번호 : ");
        for(int i = 0; i < length - 1; i++) {
        	System.out.print(lottoNums[i] + " ");
        }
        System.out.println(", 보너스 번호 : " + lottoNums[length - 1]);
        // 출력결과
        // 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
        
        
        
        // 3. 내가 선택한 번호와 당첨 번호를 대조하여 당첨확인하는 코드를 작성해주세요. (맞은 번호 개수 세기) 
        int matchCount = 0;
        boolean isExistBonusNum = false;
        for(int i = 0; i < length - 1; i++) {
        	for(int j = 0; j < length - 1; j++) {
        		if(lottoNums[i] == myChooseNums[j]) {
        			matchCount++;
        			break;//맞는게 있다면 빠져나가서 다음거 비교
        		}else if(myChooseNums[j] == lottoNums[6] && !isExistBonusNum) {//보너스 번호
        			isExistBonusNum = true;
        			break;
        			
        		}
        	}
        }
        
        //4. 당첨 결과를 출력해주세요.
        if(matchCount == 6) {
        	System.out.println("1등 당첨");
        }else if(matchCount == 5 && isExistBonusNum) {
        	System.out.println("2등 당첨");
        }else if(matchCount == 5) {
        	System.out.println("3등 당첨");
        }else if(matchCount == 4) {
        	System.out.println("4등 당첨");
        }else if(matchCount == 3) {
            System.out.println("5등 당첨");
        }else {
        	System.out.println("꽝");
        }
    }
}
