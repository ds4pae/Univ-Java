package chap3;

import java.util.Scanner;

class PhoneBook {
	String name;
	String PhoneNum;
	int count;

	public PhoneBook() {
		System.out.println("������ ȣ��");
	}

	public PhoneBook(int i) {
		count = i;
		System.out.println("������2 ȣ��");
	}

	public PhoneBook(int i , String string) {
		count = i;
		System.out.println(string + "�� ��ȭ��ȣ�� ����/�����Ͽ����ϴ�.");
	}

	public PhoneBook(String name , String phoneNum, int count) {
		this.name = name;
		this.PhoneNum = phoneNum;
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public String getPhoneNum() {
		return this.PhoneNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.PhoneNum = phoneNum;
	}

}

public class inputPhonebook {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("��ȭ��ȣ ���� ���� : ");
		int num = scan.nextInt();
		PhoneBook[] myPhoneBook = new PhoneBook [num];

		for (int i = 0 ; i<myPhoneBook.length; i++) {
			myPhoneBook[i] = new PhoneBook(i); //�߿��ϴٰ�����!!!!!!!!
			System.out.print("������� �̸� �� ��ȭ��ȣ �Է� : ");
			myPhoneBook[i].setName(scan.next());
			myPhoneBook[i].setPhoneNum(scan.next()); 
		}
		System.out.println("����Ǿ����ϴ�.");

		String searchName = "0";
		String stop = "�׸�";
		while(searchName.equals(stop) == false) {
			System.out.print("�˻��� �̸� : ");
			searchName = scan.next();
			for (int i = 0 ; i<myPhoneBook.length; i++) {
				if(myPhoneBook[i].name.equals(searchName))
					//System.out.printf("����� �̸� : %s\t%s\n",myPhoneBook[i].name,myPhoneBook[i].PhoneNum);
					System.out.println("����� �̸� : " + myPhoneBook[i].getName() + "\t" + myPhoneBook[i].getPhoneNum() + "\tcount : " + myPhoneBook[i].count);
				else System.out.println(searchName + " �� ��ȭ��ȣ�� ��ϵǾ� ���� �ʽ��ϴ�.");
			}
		}


	}

}
