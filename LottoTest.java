class LottoTest{
   public static void main(String[] args){
   System.out.println("�ζ� ��ȣ�� : ");
   int[] nLotto = new int[6];
   for(int i = 0; i<6; i++){
      nLotto[i] = (int)(Math.random() * 45) + 1;
      for(int j = 0; j<i; j++){
         if(nLotto[i] == nLotto[j]){
            i--;	
         }	
      }
   System.out.println(nLotto[i]);
   }
   }
}

