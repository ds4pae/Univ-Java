package chap3;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		int countGradeA = 0,countGradeB = 0 ,countGradeC = 0,countGradeD = 0,countGradeF = 0;
		double gradeTotal = 0, average = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ������ �Է��ϴ°� ? : ");
		double length = scanner.nextInt();
		System.out.print("������ �Է��ϼ���(0~100): ");
	
		for(int i = 0 ; i < length ; i++ ) {
			double score = scanner.nextInt();
			if(score >= 90) 				
				countGradeA++;
			else if(score >= 80) 
				countGradeB++;
			else if(score >= 70)			
				countGradeC++;
			else if(score >= 60)
				countGradeD++;
			else 
				countGradeF++;
			
			gradeTotal += score;
		}
		average = gradeTotal/length;

		System.out.println("A���� : " +countGradeA + "��" );
		System.out.println("B���� : " +countGradeB + "��" );
		System.out.println("C���� : " +countGradeC + "��" );
		System.out.println("D���� : " +countGradeD + "��" );
		System.out.println("F���� : " +countGradeF + "��\n\n" );
		System.out.println("������ " + gradeTotal + "�Դϴ�.");
		System.out.printf("����� %.2f �Դϴ�.\n",average);
		scanner.close();
	}
}