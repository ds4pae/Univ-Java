package chap3;

import java.util.Arrays;
import java.util.Random;

public class midterm_test3 {
	public static void main(String[] args) {

		int[] inputValue = new int[5];
		int redball;
		Random random = new Random();
		for (int k=0; k<10; k++) {
			for (int i=0; i<inputValue.length; i++) {
				inputValue[i] = (int) (Math.random()*69 + 1);

				for (int j=0; j<i; j++) {
					if (inputValue[j] == inputValue[i]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(inputValue);

			redball = (int) (Math.random()*26 + 1);
			
			System.out.print("PowerBall 번호 생성 결과: WhiteBall ");
			
			for (int i=0; i<inputValue.length; i++) {
				System.out.print(inputValue[i] + " ");
			}
			System.out.printf("\tRedBall "+redball+"\n");
		}
	}
}
