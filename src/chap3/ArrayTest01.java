package chap3;

import javax.swing.JOptionPane;

public class ArrayTest01 {

	public static void main(String[] args) {

		//	배열 정의, 설정, 초기값 저장
		int[] arr = {10,20,30,40,50,60};
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//	사용자로부터 인덱스 위치 값을 입력받아
		String valueA = JOptionPane.showInputDialog("첫번째 입력 인덱스 위치를 입력하세요 : ");
		int choice1 = Integer.parseInt(valueA);
		System.out.println("첫번째 입력 인덱스 위치 : " + choice1);
		int choice2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 입력 인덱스 위치를 입력하세요 :"));
		System.out.println("두번째 입력 인덱스 위치 : " + choice2);

		//	배열에 인덱스 위치에 있는 값을 교환
		int tmp = arr[choice1];
		arr[choice1] = arr[choice2];
		arr[choice2] = tmp;
		
		//전체 결과 출력
		String msg = "결과값 : ";
		
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
			msg+=arr[i]+" ";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
