package chap3;

import java.util.Scanner;

public class univ_chap3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalSum = 0;
		int cnt = scanner.nextInt();
		int[] arr = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++ ) {
			arr[i] = scanner.nextInt();
			totalSum += arr[i];
		}
			
		System.out.println("�Է��� ������ ����: " + arr.length);
		System.out.println("�Է��� ������ ��: " + totalSum);		
		scanner.close();
		}

}
