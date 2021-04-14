class Re369{
   public static void main(String[] args){
      System.out.println("369 Strat~");
      
      int nCount = 0;
      //loop 시작
      
      for(int k = 1; k < 10000; k++){
         nCount = 0;     // 3 6 9 체크
         int nNo = k;    // 결과 저장
         String sNo = "";			
         sNo = nNo + "";   // ""
         int nLen = sNo.length();
         for(int j = 0; j < nLen; j++){
         String sTmp = sNo.substring(j,j+1);
            if(
                 (sTmp.equals("3")) || (sTmp.equals("6")) || (sTmp.equals("9"))        
              )  nCount = nCount + 1;
            }   
            for (int i=1; i<=nCount; i++){
                System.out.print("짝!");
            }
            System.out.println("");	          
         }   //loop 끝
                     
   }
}
