package chap3;

import java.util.Scanner;

public class midterm_test4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է�(XXXXXX-XXXXXXX): ");
		String identity = a.next();
		
		//����
		if(identity.charAt(7)=='1'|identity.charAt(7) =='3') {
			System.out.print("���� : ���� ");
		}else if(identity.charAt(7)=='2'|identity.charAt(7) =='4') {
			System.out.print("���� : ���� ");
		}
		if(identity.charAt(7)=='1'|identity.charAt(7) =='2') {
			System.out.println("����⵵: 19" + identity.substring(0,2)+"�� "+identity.substring(2,4)+"�� "+identity.substring(4,6)+"�� ��");
		}else if(identity.charAt(7)=='3'|identity.charAt(7) =='4') {
			System.out.println("����⵵: 20" + identity.substring(0,2)+"�� "+identity.substring(2,4)+"�� "+identity.substring(4,6)+"�� ��");
		}
		
		System.out.println("����ŷ�� �ֹε�Ϲ�ȣ:"+identity.substring(0,8)+"******");
	}
}
