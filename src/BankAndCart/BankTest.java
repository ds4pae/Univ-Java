package BankAndCart;

public class BankTest {

   public static int count = 0;
   
   public static void main(String[] args) {
      Bank bk_1 = new Bank();
      Bank bk_2 = new Bank();
      Bank bk_3 = new Bank();
      
      Bank[] kakao = new Bank[100];
      
      for(int i = 0 ; i < kakao.length;i++) {
         kakao[i] = new Bank("카카오뱅크");
      }
      
      if(kakao[count].accountOpen("홍길동", "0000-00-1234567","010-1234-5678",1234,10000)) {
         System.out.println("통장 개설 성공");
         count++;
      }else {
         System.out.println("통장 개설 실패");
      }
                  
      kakao[0].show();
      kakao[0].showaccount();
      kakao[0].deposit(10000);
      kakao[0].showaccount();
      kakao[0].withdraw(10000);
      kakao[0].showaccount();
      
      transfer(kakao[0],kakao[1],100);
   }

   private static void transfer(Bank fromBank, Bank toBank, int i) {
	   //송금
	      if(fromBank.withdraw(i)) {
	    	  toBank.deposit(i);
	      }
	   
   }

   

}
