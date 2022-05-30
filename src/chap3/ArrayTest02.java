package chap3;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {

		//사용자로부터 배열의 크기를 입력 받고,
		int arraySize = Integer.parseInt(JOptionPane.showInputDialog("배열의 크기? : "));
		int[] arr = new int [arraySize];

		//사용자가 직접 입력한 값을 배열에 저장한 후,
		String msg ="사용자가 입력한 배열값 : ";
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog(i + "번째 배열에 저장할 값? : "));
			msg += arr[i] + " ";
		}
		JOptionPane.showMessageDialog(null, msg);
		//배열에 있는 정수 중에서 원하는 수를 출력


		int m = Integer.parseInt(JOptionPane.showInputDialog("몇의 배수 출력? : "));
		String msg2 = m + "의 배수 : ";
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%m == 0) {
				msg2+=arr[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, msg2);
	}

}


