package BankAndCart;

public class Bank {
   String bankName; //은행명
   String owner;   //계좌 예금주명
   String account; //계좌 번호
   String phone;   //연락처
   int password;   //비밀번호
   int balance;   //잔액

   public Bank(String bankName) {
      this.bankName = bankName;
   }

   public Bank(String bankName,String owner) {
      this.bankName = bankName;
      this.owner = owner;
   }

   public Bank() {

   }
   public int getBalance(){return this.balance;}
   
   public void deposit(int balance) {
      if(balance > 1)
         this.balance = this.balance + balance;
      //else System.out.println("1원 이상 입력해야합니다.");
   }
   
   public boolean withdraw(int balance) {
      if(balance > 1) {
         this.balance = this.balance - balance;
         return true;
      }
      else return false;
     
   }
   
   public void show() {
      System.out.println("-------------잔액 조회-------------");
      System.out.println("현재 통장 잔액은 " + this.balance +"원 입니다.");
      System.out.println("-------------END----------------");
   }

   public void showaccount() {
      System.out.println("-------------통장 조회-------------");
      System.out.println("은행명 : " + this.bankName);
      System.out.println("예금주 :"+ this.owner);
      System.out.println("계좌번호 :"+ this.account);
      System.out.println("잔액 :"+ this.balance);
      System.out.println("-------------END----------------");
   }
   public boolean accountOpen(String owner,String account,String phone,int password,int balance){

      boolean accountOpenResult = false;
      this.owner = owner;
      if(!checkAccountDuplicate(account)) {
         this.account = account;
         accountOpenResult = true;
      }
      this.phone = phone;
      this.password = password;
      this.balance = balance;

      return accountOpenResult;
   }

   private boolean checkAccountDuplicate(String account) {
      // 작성해야함
      return account.equals(this.account);
      }

}