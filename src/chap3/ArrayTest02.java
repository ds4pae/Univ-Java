package chap3;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {

		//����ڷκ��� �迭�� ũ�⸦ �Է� �ް�,
		int arraySize = Integer.parseInt(JOptionPane.showInputDialog("�迭�� ũ��? : "));
		int[] arr = new int [arraySize];

		//����ڰ� ���� �Է��� ���� �迭�� ������ ��,
		String msg ="����ڰ� �Է��� �迭�� : ";
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog(i + "��° �迭�� ������ ��? : "));
			msg += arr[i] + " ";
		}
		JOptionPane.showMessageDialog(null, msg);
		//�迭�� �ִ� ���� �߿��� ���ϴ� ���� ���


		int m = Integer.parseInt(JOptionPane.showInputDialog("���� ��� ���? : "));
		String msg2 = m + "�� ��� : ";
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%m == 0) {
				msg2+=arr[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, msg2);
	}

}


