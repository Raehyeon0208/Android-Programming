package basic;
import java.util.Scanner;
class Main{

	public static void ScrPrint (String sMsg) {                                     //none static 에러 시 static 있으면 지우고 없으면 넣음 
		System.out.println(sMsg);
	}
	public static int MyRandom (int nStart, int nCount){
		int nResult = (int)(Math.random() * nCount) + nStart; 
		return nResult;
	}
	public static void CurrDisplay(int nUser1, int nCom1){
		//사용자 값 출력
		if(nUser1 == 1) ScrPrint("사용자 : 가위");
		if(nUser1 == 2) ScrPrint("사용자 : 바위");
		if(nUser1 == 3) ScrPrint("사용자 : 보자기");

		//컴퓨터 값 출력
		if(nCom1 == 1) ScrPrint("컴퓨터 : 가위");      
		if(nCom1 == 2) ScrPrint("컴퓨터 : 바위");     
		if(nCom1 == 3) ScrPrint("컴퓨터 : 보자기");
	} 

	public static void main(String[] args){
		int winner = -1; // 0 = 사용자 1 = 컴퓨터
		ScrPrint(" 1 : 가위 2 : 바위 3 : 보");  
		Scanner scv = new Scanner(System.in);

		while(true){
			ScrPrint("가위바위보!~~~");
			int nUser = scv.nextInt();
			int nCom = MyRandom(1,3);   
			CurrDisplay(nUser,nCom);
			if(nUser == 1){                                           // 가위바위보 판단
				if(nCom == 1) ScrPrint("비김 다시입력"); 
				if(nCom == 2) { ScrPrint("컴퓨터가 이김"); winner = 1;}
				if(nCom == 3) { ScrPrint("사용자가 이김"); winner = 0;}
			}
			if(nUser == 2){
				if(nCom == 1) { ScrPrint("사용자가 이김");winner = 0;}
				if(nCom == 2) ScrPrint("비김 다시입력"); 
				if(nCom == 3) { ScrPrint("컴퓨터가 이김");winner = 1;}
			}
			if(nUser == 3){
				if(nCom == 1) { ScrPrint("컴퓨터가 이김");winner = 1;}
				if(nCom == 2) { ScrPrint("사용자가 이김");winner = 0;}
				if(nCom == 3) ScrPrint("비김 다시입력"); 
			}
			if(nUser != nCom){
				break;
			}

		}	
		ScrPrint("");
		ScrPrint("묵찌빠 시작~");
		ScrPrint("1:가위 2:바위 3:보 중 하나를 입력하세요~");
		while(true){
			String Swinner = "";                                 // 이긴 사람 출력위한 변수
			if(winner == 1)   
				Swinner = "컴퓨터"; 
			else{
				Swinner = "사용자";
			}	

			int nUser2 = scv.nextInt();
			int nCom2 = MyRandom(1,3);
			CurrDisplay(nUser2,nCom2); 	
			if(nUser2 == 1){                                          // 묵찌빠 판단 비길 시 끝, 이긴 사람 공격권
				if(nCom2 == 2) winner = 1;                         // 컴퓨터 승리
				if(nCom2 == 3) winner = 0;          // 사용자 승리
			}
			if(nUser2 == 2){
				if(nCom2 == 1) winner = 0;  //사용자 승리
				if(nCom2 == 3) winner = 1;  //컴퓨터 승리
			}
			if(nUser2 == 3){
				if(nCom2 == 1) winner = 1;  //컴퓨터 승리
				if(nCom2 == 2) winner = 0;  //사용자 승리
			}
			if(nUser2 == nCom2){   //이긴 사람 출력
				ScrPrint(Swinner + "가 승리!");
				break; 
			}
			if(winner == 0){    // 공격권 출력
				ScrPrint("사용자 공격권");
			}
			if(winner == 1){    // 공격권 출력
				ScrPrint("컴퓨터 공격권");
			}
		}
	}
}