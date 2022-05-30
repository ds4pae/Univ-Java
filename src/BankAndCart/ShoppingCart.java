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
		System.out.println("īƮ�� �������� ��ҽ��ϴ�.");
	}

	public String showCart() {
		String contents = "\n����īƮ\n";
		contents += "\n��ǰ\t����\t����\t�Ѿ�\n";
		
		for(int i = 0 ; i < itemCount;i++) {
			contents += item[i].showItem();
		}
		contents += "\n�� ���űݾ� : " + getTotalPrice() + "\n";
		return contents;
	}
	
}
