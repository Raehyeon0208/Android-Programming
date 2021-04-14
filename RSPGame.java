package basic;
import java.util.Scanner;
class Main{

	public static void ScrPrint (String sMsg) {                                     //none static ���� �� static ������ ����� ������ ���� 
		System.out.println(sMsg);
	}
	public static int MyRandom (int nStart, int nCount){
		int nResult = (int)(Math.random() * nCount) + nStart; 
		return nResult;
	}
	public static void CurrDisplay(int nUser1, int nCom1){
		//����� �� ���
		if(nUser1 == 1) ScrPrint("����� : ����");
		if(nUser1 == 2) ScrPrint("����� : ����");
		if(nUser1 == 3) ScrPrint("����� : ���ڱ�");

		//��ǻ�� �� ���
		if(nCom1 == 1) ScrPrint("��ǻ�� : ����");      
		if(nCom1 == 2) ScrPrint("��ǻ�� : ����");     
		if(nCom1 == 3) ScrPrint("��ǻ�� : ���ڱ�");
	} 

	public static void main(String[] args){
		int winner = -1; // 0 = ����� 1 = ��ǻ��
		ScrPrint(" 1 : ���� 2 : ���� 3 : ��");  
		Scanner scv = new Scanner(System.in);

		while(true){
			ScrPrint("����������!~~~");
			int nUser = scv.nextInt();
			int nCom = MyRandom(1,3);   
			CurrDisplay(nUser,nCom);
			if(nUser == 1){                                           // ���������� �Ǵ�
				if(nCom == 1) ScrPrint("��� �ٽ��Է�"); 
				if(nCom == 2) { ScrPrint("��ǻ�Ͱ� �̱�"); winner = 1;}
				if(nCom == 3) { ScrPrint("����ڰ� �̱�"); winner = 0;}
			}
			if(nUser == 2){
				if(nCom == 1) { ScrPrint("����ڰ� �̱�");winner = 0;}
				if(nCom == 2) ScrPrint("��� �ٽ��Է�"); 
				if(nCom == 3) { ScrPrint("��ǻ�Ͱ� �̱�");winner = 1;}
			}
			if(nUser == 3){
				if(nCom == 1) { ScrPrint("��ǻ�Ͱ� �̱�");winner = 1;}
				if(nCom == 2) { ScrPrint("����ڰ� �̱�");winner = 0;}
				if(nCom == 3) ScrPrint("��� �ٽ��Է�"); 
			}
			if(nUser != nCom){
				break;
			}

		}	
		ScrPrint("");
		ScrPrint("����� ����~");
		ScrPrint("1:���� 2:���� 3:�� �� �ϳ��� �Է��ϼ���~");
		while(true){
			String Swinner = "";                                 // �̱� ��� ������� ����
			if(winner == 1)   
				Swinner = "��ǻ��"; 
			else{
				Swinner = "�����";
			}	

			int nUser2 = scv.nextInt();
			int nCom2 = MyRandom(1,3);
			CurrDisplay(nUser2,nCom2); 	
			if(nUser2 == 1){                                          // ����� �Ǵ� ��� �� ��, �̱� ��� ���ݱ�
				if(nCom2 == 2) winner = 1;                         // ��ǻ�� �¸�
				if(nCom2 == 3) winner = 0;          // ����� �¸�
			}
			if(nUser2 == 2){
				if(nCom2 == 1) winner = 0;  //����� �¸�
				if(nCom2 == 3) winner = 1;  //��ǻ�� �¸�
			}
			if(nUser2 == 3){
				if(nCom2 == 1) winner = 1;  //��ǻ�� �¸�
				if(nCom2 == 2) winner = 0;  //����� �¸�
			}
			if(nUser2 == nCom2){   //�̱� ��� ���
				ScrPrint(Swinner + "�� �¸�!");
				break; 
			}
			if(winner == 0){    // ���ݱ� ���
				ScrPrint("����� ���ݱ�");
			}
			if(winner == 1){    // ���ݱ� ���
				ScrPrint("��ǻ�� ���ݱ�");
			}
		}
	}
}