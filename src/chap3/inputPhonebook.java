package chap3;

import java.util.Scanner;

class PhoneBook {
	String name;
	String PhoneNum;
	int count;

	public PhoneBook() {
		System.out.println("생성자 호출");
	}

	public PhoneBook(int i) {
		count = i;
		System.out.println("생성자2 호출");
	}

	public PhoneBook(int i , String string) {
		count = i;
		System.out.println(string + "에 전화번호를 저장/생성하였습니다.");
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
		System.out.print("전화번호 저장 개수 : ");
		int num = scan.nextInt();
		PhoneBook[] myPhoneBook = new PhoneBook [num];

		for (int i = 0 ; i<myPhoneBook.length; i++) {
			myPhoneBook[i] = new PhoneBook(i); //중요하다고했음!!!!!!!!
			System.out.print("사용자의 이름 및 전화번호 입력 : ");
			myPhoneBook[i].setName(scan.next());
			myPhoneBook[i].setPhoneNum(scan.next()); 
		}
		System.out.println("저장되었습니다.");

		String searchName = "0";
		String stop = "그만";
		while(searchName.equals(stop) == false) {
			System.out.print("검색할 이름 : ");
			searchName = scan.next();
			for (int i = 0 ; i<myPhoneBook.length; i++) {
				if(myPhoneBook[i].name.equals(searchName))
					//System.out.printf("사용자 이름 : %s\t%s\n",myPhoneBook[i].name,myPhoneBook[i].PhoneNum);
					System.out.println("사용자 이름 : " + myPhoneBook[i].getName() + "\t" + myPhoneBook[i].getPhoneNum() + "\tcount : " + myPhoneBook[i].count);
				else System.out.println(searchName + " 의 전화번호는 등록되어 있지 않습니다.");
			}
		}


	}

}
