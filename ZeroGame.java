import java.util.Scanner;

class ZeroGame{
   public static void main(String[] args){
   Scanner scv = new Scanner(System.in);
      System.out.println("���ΰ����� �����մϴ�.");
      

      while(true){
         System.out.println("�����ο��� �Է��ϼ��� ��, �ִ� 9��.");
         int nPer = scv.nextInt();
         if(nPer > 9 || nPer < 0){
            System.out.println("�ٽ� �Է����ּ���!");
            continue;
      }
         int nCom = (int)(Math.random() * 10) +0;

         //loop ����
         while(true){
         System.out.println("�Ͼ �ο��� �Է��ϼ���!.");
         int nUser = scv.nextInt();   
         if(nUser > nPer){
            System.out.println("�ٽ� �Է����ּ���!");
            continue;            
         }
   
         //loop ��

         if(nUser == nCom){
            System.out.println("��ǻ�ʹ� " + nCom + " ���� " + nUser);
            System.out.println("***��ǻ�� Win***");
         }
            else {
            System.out.println("��ǻ�ʹ� " + nCom + " ���� " + nUser);
            System.out.println("***���� Win***");
            }
       System.out.println("��� �Ͻðڽ��ϱ�?");
            System.out.println("1 : �Ѵ� |||| 2: �� �Ѵ�");
            int nCoin = scv.nextInt();
            if(nCom != 1){
	break;
            }
      }
      }
   }
}

