class gbb
{
   public static void main(String[] args)
   {
      String sNo;
      char chTemp;
      int nCount = 0;
      String sValue = "134679";
      /*for(int i = 1; i<=1000; i++)
      {   
          
         sNo = i + "";
         if((sNo.indexOf('3') != -1) ||
               (sNo.indexOf('6') != -1) ||
                  (sNo.indexOf('9') != -1)){
            System.out.println(i + "|");          
          }
          else{
             System.out.println(i);
          }*/
          for(int n=1; n<=1000; n++) {
   sValue = "" + n;
              nCount = 0;
              for(int k=0; k<sValue.length(); k++) {
                 chTemp = sValue.charAt(k);
                 if(chTemp == '3'||chTemp == '6'||chTemp == '9'){
                    nCount = nCount + 1;
             }     
   
          }     System.out.print(n);   
                for(int j = 0; j<nCount; j++){
                System.out.print("¦");
          }
   System.out.println();
      }
            
   }
}