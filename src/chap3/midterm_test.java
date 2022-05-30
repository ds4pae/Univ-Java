package chap3;

import java.util.Random;

public class midterm_test {

	public static void main(String[] args) {
		//1~100 사이 양의정수 10개 생성 배열 저장 4의배수만 출력\
		int[] value = new int[10]; 	
		Random random = new Random();
		for (int i=0; i<value.length; i++) {
			value[i] = (int) (Math.random()*100 + 1);
		}
			System.out.println("1~100사이 양의 정수 10개 생성 결과");
			for (int i=0; i<value.length; i++) 
				System.out.print(value[i] + " ");
			System.out.println();
			System.out.print("4의 배수 : ");
			for (int i=0; i<value.length; i++) {
				if(value[i]%4 == 0)
					System.out.print(value[i]+" ");
			}
	}

}
