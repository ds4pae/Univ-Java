package chap3;

import javax.swing.JOptionPane;

public class ArrayTest01 {

	public static void main(String[] args) {

		//	�迭 ����, ����, �ʱⰪ ����
		int[] arr = {10,20,30,40,50,60};
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//	����ڷκ��� �ε��� ��ġ ���� �Է¹޾�
		String valueA = JOptionPane.showInputDialog("ù��° �Է� �ε��� ��ġ�� �Է��ϼ��� : ");
		int choice1 = Integer.parseInt(valueA);
		System.out.println("ù��° �Է� �ε��� ��ġ : " + choice1);
		int choice2 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° �Է� �ε��� ��ġ�� �Է��ϼ��� :"));
		System.out.println("�ι�° �Է� �ε��� ��ġ : " + choice2);

		//	�迭�� �ε��� ��ġ�� �ִ� ���� ��ȯ
		int tmp = arr[choice1];
		arr[choice1] = arr[choice2];
		arr[choice2] = tmp;
		
		//��ü ��� ���
		String msg = "����� : ";
		
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
			msg+=arr[i]+" ";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
