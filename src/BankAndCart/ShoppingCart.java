package BankAndCart;

public class ShoppingCart {
	int capacity;
	public Item[] item;
	public int totalPrice;
	int itemCount;
	
	
	public ShoppingCart(int capacity) {
		super();
		getCapacity();
		getTotalPrice();
		getItemCount();
		item = new Item[capacity];
	}

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void addToCart(String itemName, int itemPrice, int itemQuantity) {
		// TODO Auto-generated method stub
		Item newItem = new Item(itemName,itemPrice,itemQuantity);
		
		item[itemCount] = newItem;
		itemCount++;
		totalPrice = totalPrice + (itemPrice*itemQuantity);
		System.out.println("카트에 아이템을 담았습니다.");
	}

	public String showCart() {
		String contents = "\n쇼핑카트\n";
		contents += "\n상품\t가격\t수량\t총액\n";
		
		for(int i = 0 ; i < itemCount;i++) {
			contents += item[i].showItem();
		}
		contents += "\n총 구매금액 : " + getTotalPrice() + "\n";
		return contents;
	}
	
}
