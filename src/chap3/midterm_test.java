package chap3;

import java.util.Random;

public class midterm_test {

	public static void main(String[] args) {
		//1~100 ���� �������� 10�� ���� �迭 ���� 4�ǹ���� ���\
		int[] value = new int[10]; 	
		Random random = new Random();
		for (int i=0; i<value.length; i++) {
			value[i] = (int) (Math.random()*100 + 1);
		}
			System.out.println("1~100���� ���� ���� 10�� ���� ���");
			for (int i=0; i<value.length; i++) 
				System.out.print(value[i] + " ");
			System.out.println();
			System.out.print("4�� ��� : ");
			for (int i=0; i<value.length; i++) {
				if(value[i]%4 == 0)
					System.out.print(value[i]+" ");
			}
	}

}
