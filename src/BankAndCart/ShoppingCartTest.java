package BankAndCart;

import java.util.Scanner;

public class ShoppingCartTest{

	static int count = 0;


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String flag = "Y";
		String itemName;
		int itemPrice;
		int itemQuantity;

		System.out.print("īƮ�� ���� �� �ִ� ������ �������� �Է��ϼ��� : ");
		int itemMax = scan.nextInt();

		ShoppingCart scart = new ShoppingCart(itemMax);
		while(flag.equals("Y") | flag.equals("y")) {

			if (count >= itemMax) {
				break;
			}
			else {
				count++;
				System.out.print(count+"���� ���� ��ǰ �̸�:");
				itemName = scan.next();
				System.out.print(count+"���� ���� ��ǰ ����:");
				itemPrice = scan.nextInt();
				System.out.print(count+"���� ���� ��ǰ ����:");
				itemQuantity = scan.nextInt();

				scart.addToCart(itemName, itemPrice , itemQuantity);
				System.out.print(scart.showCart());
				System.out.print("������ ����Ͻðڽ��ϱ� (Y or N)");
				flag = scan.next();
			}
		}
		System.out.println("\nīƮ�� ��� ��ǰ�� �����ϼ���.");
		System.out.println("�� ������ : " + scart.totalPrice);
	}

}
