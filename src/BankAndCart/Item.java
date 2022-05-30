package BankAndCart;

public class Item {
	private String name;
	private int price;
	private int quantity;

	public Item(String name, int price, int quantity) {
		super();
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String showItem() {
		String itemInfo;
		itemInfo = getName() + "\t" + getPrice() + "\t" + getQuantity() + "\t" + (this.price*this.quantity) + "\n";
		return itemInfo;
	}
}
