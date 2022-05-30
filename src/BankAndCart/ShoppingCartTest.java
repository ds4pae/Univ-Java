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

		System.out.print("카트에 담을 수 있는 물건의 가지수를 입력하세요 : ");
		int itemMax = scan.nextInt();

		ShoppingCart scart = new ShoppingCart(itemMax);
		while(flag.equals("Y") | flag.equals("y")) {

			if (count >= itemMax) {
				break;
			}
			else {
				count++;
				System.out.print(count+"번쨰 구매 상품 이름:");
				itemName = scan.next();
				System.out.print(count+"번쨰 구매 상품 가격:");
				itemPrice = scan.nextInt();
				System.out.print(count+"번쨰 구매 상품 수량:");
				itemQuantity = scan.nextInt();

				scart.addToCart(itemName, itemPrice , itemQuantity);
				System.out.print(scart.showCart());
				System.out.print("쇼핑을 계속하시겠습니까 (Y or N)");
				flag = scan.next();
			}
		}
		System.out.println("\n카트에 담긴 물품을 결제하세요.");
		System.out.println("총 결제액 : " + scart.totalPrice);
	}

}
