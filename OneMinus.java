package asfaasf;
import java.util.Scanner;
public class OneMinus{

	public static void ScrPrint (String sMsg) {                                     //none static 에러 시 static 있으면 지우고 없으면 넣음 
		System.out.println(sMsg);
	}
	public static int MyRandom (int nStart, int nCount){
		int nResult = (int)(Math.random() * nCount) + nStart; 
		return nResult;
	}
	public static void CurrDisplayUL(int nUserL1){
		//사용자 값 출력
		if(nUserL1 == 1) System.out.printf(" 사용자 - 왼손: 가위");
		if(nUserL1 == 2) System.out.printf(" 사용자 - 왼손: 바위");
		if(nUserL1 == 3) System.out.printf(" 사용자 - 왼손: 보자기");
	}
	public static void CurrDisplayUR(int nUserR1){
		if(nUserR1 == 1) System.out.printf(" 사용자 - 오른손: 가위");
		if(nUserR1 == 2) System.out.printf(" 사용자 - 오른손: 바위");
		if(nUserR1 == 3) System.out.printf(" 사용자 - 오른손: 보자기");
	}

	public static void CurrDisplayCL(int nComL1){
		if(nComL1 == 1) System.out.printf(" 컴퓨터 - 왼손: 가위");      
		if(nComL1 == 2) System.out.printf(" 컴퓨터 - 왼손: 바위");     
		if(nComL1 == 3) System.out.printf(" 컴퓨터 - 왼손: 보자기");
	}

	public static void CurrDisplayCR(int nComR1){
		if(nComR1 == 1) System.out.printf(" 컴퓨터 - 오른손: 가위");      
		if(nComR1 == 2) System.out.printf(" 컴퓨터 - 오른손: 바위");     
		if(nComR1 == 3) System.out.printf(" 컴퓨터 - 오른손: 보자기");
	}

	public static void main(String[] args) {
		int nSum = 0;
		int nComWin = 0;
		int nUserWin = 0;
		int nDraw = 0;
		while(true) {
			nSum = nSum + 1;
			ScrPrint("하나빼기 시작 (202030111 박래현)");
			ScrPrint("왼손 가위/바위/보 선택하세요 (가위:1 바위:2 보:3)");
			ScrPrint("오른손 가위/바위/보 선택하세요 (가위:1 바위:2 보:3)");
			Scanner sc = new Scanner(System.in);
			int nUserL1 = sc.nextInt();
			int nUserR1 = sc.nextInt();
			int nComL1 = MyRandom(1,3);
			int nComR1 = MyRandom(1,3);
			CurrDisplayUL(nUserL1);
			CurrDisplayUR(nUserR1);
			ScrPrint("");
			CurrDisplayCL(nComL1);
			CurrDisplayCR(nComR1);
			ScrPrint("");
			ScrPrint("하나빼기 할 손을 선택하세요 1. 왼손 2. 오른손");
			int nWinner= -1;       // 사용자가 이기면 0 컴퓨터가 이기면 1

			int nUserP = sc.nextInt();
			int nComP = MyRandom(1,2);
			if(nUserP == 1) CurrDisplayUL(nUserL1);
			if(nUserP == 2) CurrDisplayUR(nUserR1);
			if(nComP == 1) CurrDisplayCL(nComL1);
			if(nComP == 2) CurrDisplayCR(nComR1);
			ScrPrint("");
			if(nUserP == 1 && nComP == 1) {
				if(nUserL1 == 1) {
					if(nComL1 == 1) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 2) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 3) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 2) {
					if(nComL1 == 2) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 3) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 1) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 3) {
					if(nComL1 == 3) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 1) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 2) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 1 && nComP == 2) {
				if(nUserL1 == 1) {
					if(nComR1 == 1) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 2) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 3) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 2) {
					if(nComR1 == 2) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 3) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 1) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 3) {
					if(nComR1 == 3) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 1) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 2) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 2 && nComP == 1) {
				if(nUserR1 == 1) {
					if(nComL1 == 1) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 2) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 3) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 2) {
					if(nComL1 == 2) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 3) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 1) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 3) {
					if(nComL1 == 3) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComL1 == 1) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComL1 == 2) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 2 && nComP == 2) {
				if(nUserR1 == 1) {
					if(nComR1 == 1) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 2) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 3) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 2) {
					if(nComR1 == 2) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 3) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 1) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 3) {
					if(nComR1 == 3) {ScrPrint("비겼습니다."); nDraw++;}
					if(nComR1 == 1) {ScrPrint("컴퓨터가 이겼습니다"); nComWin++;}
					if(nComR1 == 2) {ScrPrint("사용자가 이겼습니다."); nUserWin = nUserWin + 1;}
				}
			}
			ScrPrint("계속 하시겠습니까? YES : 1 , NO : 2");

			int nCon = sc.nextInt();
			if(nCon == 1) {
				continue;
			}
			if(nCon == 2){
				ScrPrint("총 게임 횟수: " + nSum + "회, 사용자 승 " + nUserWin + "회, 사용자 승률 : " + (float)(nUserWin/nSum)*100 + "%");
				break;
			}
		}

	}
}