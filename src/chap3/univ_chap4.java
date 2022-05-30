package chap3;

import java.util.Arrays;
import java.util.Random;

public class univ_chap4 {
	public static void main(String[] args) {

		int[] inputValue = new int[5];

		Random random = new Random();
		for (int k=0; k<5; k++) {
			for (int i=0; i<inputValue.length; i++) {
				inputValue[i] = (int) (Math.random()*45 + 1);

				for (int j=0; j<i; j++) {
					if (inputValue[j] == inputValue[i]) {
						i--;
						break;
					}
				}
			}

			Arrays.sort(inputValue);

			System.out.print("로또 번호 생성 결과: ");
			for (int i=0; i<inputValue.length; i++) {
				System.out.print(inputValue[i] + " ");
			}
			System.out.println();
		}
	}
}