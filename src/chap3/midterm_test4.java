package chap3;

import java.util.Scanner;

public class midterm_test4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("주민등록번호 입력(XXXXXX-XXXXXXX): ");
		String identity = a.next();
		
		//성별
		if(identity.charAt(7)=='1'|identity.charAt(7) =='3') {
			System.out.print("성별 : 남자 ");
		}else if(identity.charAt(7)=='2'|identity.charAt(7) =='4') {
			System.out.print("성별 : 여자 ");
		}
		if(identity.charAt(7)=='1'|identity.charAt(7) =='2') {
			System.out.println("출생년도: 19" + identity.substring(0,2)+"년 "+identity.substring(2,4)+"월 "+identity.substring(4,6)+"일 생");
		}else if(identity.charAt(7)=='3'|identity.charAt(7) =='4') {
			System.out.println("출생년도: 20" + identity.substring(0,2)+"년 "+identity.substring(2,4)+"월 "+identity.substring(4,6)+"일 생");
		}
		
		System.out.println("마스킹된 주민등록번호:"+identity.substring(0,8)+"******");
	}
}
