package BankAndCart;

public class Bank {
   String bankName; //�����
   String owner;   //���� �����ָ�
   String account; //���� ��ȣ
   String phone;   //����ó
   int password;   //��й�ȣ
   int balance;   //�ܾ�

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
      //else System.out.println("1�� �̻� �Է��ؾ��մϴ�.");
   }
   
   public boolean withdraw(int balance) {
      if(balance > 1) {
         this.balance = this.balance - balance;
         return true;
      }
      else return false;
     
   }
   
   public void show() {
      System.out.println("-------------�ܾ� ��ȸ-------------");
      System.out.println("���� ���� �ܾ��� " + this.balance +"�� �Դϴ�.");
      System.out.println("-------------END----------------");
   }

   public void showaccount() {
      System.out.println("-------------���� ��ȸ-------------");
      System.out.println("����� : " + this.bankName);
      System.out.println("������ :"+ this.owner);
      System.out.println("���¹�ȣ :"+ this.account);
      System.out.println("�ܾ� :"+ this.balance);
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
      // �ۼ��ؾ���
      return account.equals(this.account);
      }

}