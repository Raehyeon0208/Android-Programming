package asfaasf;
import java.util.Scanner;
public class OneMinus{

	public static void ScrPrint (String sMsg) {                                     //none static ���� �� static ������ ����� ������ ���� 
		System.out.println(sMsg);
	}
	public static int MyRandom (int nStart, int nCount){
		int nResult = (int)(Math.random() * nCount) + nStart; 
		return nResult;
	}
	public static void CurrDisplayUL(int nUserL1){
		//����� �� ���
		if(nUserL1 == 1) System.out.printf(" ����� - �޼�: ����");
		if(nUserL1 == 2) System.out.printf(" ����� - �޼�: ����");
		if(nUserL1 == 3) System.out.printf(" ����� - �޼�: ���ڱ�");
	}
	public static void CurrDisplayUR(int nUserR1){
		if(nUserR1 == 1) System.out.printf(" ����� - ������: ����");
		if(nUserR1 == 2) System.out.printf(" ����� - ������: ����");
		if(nUserR1 == 3) System.out.printf(" ����� - ������: ���ڱ�");
	}

	public static void CurrDisplayCL(int nComL1){
		if(nComL1 == 1) System.out.printf(" ��ǻ�� - �޼�: ����");      
		if(nComL1 == 2) System.out.printf(" ��ǻ�� - �޼�: ����");     
		if(nComL1 == 3) System.out.printf(" ��ǻ�� - �޼�: ���ڱ�");
	}

	public static void CurrDisplayCR(int nComR1){
		if(nComR1 == 1) System.out.printf(" ��ǻ�� - ������: ����");      
		if(nComR1 == 2) System.out.printf(" ��ǻ�� - ������: ����");     
		if(nComR1 == 3) System.out.printf(" ��ǻ�� - ������: ���ڱ�");
	}

	public static void main(String[] args) {
		int nSum = 0;
		int nComWin = 0;
		int nUserWin = 0;
		int nDraw = 0;
		while(true) {
			nSum = nSum + 1;
			ScrPrint("�ϳ����� ���� (202030111 �ڷ���)");
			ScrPrint("�޼� ����/����/�� �����ϼ��� (����:1 ����:2 ��:3)");
			ScrPrint("������ ����/����/�� �����ϼ��� (����:1 ����:2 ��:3)");
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
			ScrPrint("�ϳ����� �� ���� �����ϼ��� 1. �޼� 2. ������");
			int nWinner= -1;       // ����ڰ� �̱�� 0 ��ǻ�Ͱ� �̱�� 1

			int nUserP = sc.nextInt();
			int nComP = MyRandom(1,2);
			if(nUserP == 1) CurrDisplayUL(nUserL1);
			if(nUserP == 2) CurrDisplayUR(nUserR1);
			if(nComP == 1) CurrDisplayCL(nComL1);
			if(nComP == 2) CurrDisplayCR(nComR1);
			ScrPrint("");
			if(nUserP == 1 && nComP == 1) {
				if(nUserL1 == 1) {
					if(nComL1 == 1) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 2) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 3) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 2) {
					if(nComL1 == 2) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 3) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 1) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 3) {
					if(nComL1 == 3) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 1) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 2) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 1 && nComP == 2) {
				if(nUserL1 == 1) {
					if(nComR1 == 1) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 2) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 3) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 2) {
					if(nComR1 == 2) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 3) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 1) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserL1 == 3) {
					if(nComR1 == 3) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 1) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 2) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 2 && nComP == 1) {
				if(nUserR1 == 1) {
					if(nComL1 == 1) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 2) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 3) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 2) {
					if(nComL1 == 2) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 3) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 1) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 3) {
					if(nComL1 == 3) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComL1 == 1) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComL1 == 2) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
			}
			if(nUserP == 2 && nComP == 2) {
				if(nUserR1 == 1) {
					if(nComR1 == 1) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 2) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 3) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 2) {
					if(nComR1 == 2) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 3) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 1) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
				if(nUserR1 == 3) {
					if(nComR1 == 3) {ScrPrint("�����ϴ�."); nDraw++;}
					if(nComR1 == 1) {ScrPrint("��ǻ�Ͱ� �̰���ϴ�"); nComWin++;}
					if(nComR1 == 2) {ScrPrint("����ڰ� �̰���ϴ�."); nUserWin = nUserWin + 1;}
				}
			}
			ScrPrint("��� �Ͻðڽ��ϱ�? YES : 1 , NO : 2");

			int nCon = sc.nextInt();
			if(nCon == 1) {
				continue;
			}
			if(nCon == 2){
				ScrPrint("�� ���� Ƚ��: " + nSum + "ȸ, ����� �� " + nUserWin + "ȸ, ����� �·� : " + (float)(nUserWin/nSum)*100 + "%");
				break;
			}
		}

	}
}