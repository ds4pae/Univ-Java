package chap3;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		int countGradeA = 0,countGradeB = 0 ,countGradeC = 0,countGradeD = 0,countGradeF = 0;
		double gradeTotal = 0, average = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 점수를 입력하는가 ? : ");
		double length = scanner.nextInt();
		System.out.print("점수를 입력하세요(0~100): ");
	
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

		System.out.println("A학점 : " +countGradeA + "명" );
		System.out.println("B학점 : " +countGradeB + "명" );
		System.out.println("C학점 : " +countGradeC + "명" );
		System.out.println("D학점 : " +countGradeD + "명" );
		System.out.println("F학점 : " +countGradeF + "명\n\n" );
		System.out.println("총점은 " + gradeTotal + "입니다.");
		System.out.printf("평균은 %.2f 입니다.\n",average);
		scanner.close();
	}
}