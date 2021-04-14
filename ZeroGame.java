import java.util.Scanner;

class ZeroGame{
   public static void main(String[] args){
   Scanner scv = new Scanner(System.in);
      System.out.println("제로게임을 시작합니다.");
      

      while(true){
         System.out.println("참가인원을 입력하세요 단, 최대 9명.");
         int nPer = scv.nextInt();
         if(nPer > 9 || nPer < 0){
            System.out.println("다시 입력해주세요!");
            continue;
      }
         int nCom = (int)(Math.random() * 10) +0;

         //loop 시작
         while(true){
         System.out.println("일어날 인원을 입력하세요!.");
         int nUser = scv.nextInt();   
         if(nUser > nPer){
            System.out.println("다시 입력해주세요!");
            continue;            
         }
   
         //loop 끝

         if(nUser == nCom){
            System.out.println("컴퓨터는 " + nCom + " 나는 " + nUser);
            System.out.println("***컴퓨터 Win***");
         }
            else {
            System.out.println("컴퓨터는 " + nCom + " 나는 " + nUser);
            System.out.println("***내가 Win***");
            }
       System.out.println("계속 하시겠습니까?");
            System.out.println("1 : 한다 |||| 2: 안 한다");
            int nCoin = scv.nextInt();
            if(nCom != 1){
	break;
            }
      }
      }
   }
}

