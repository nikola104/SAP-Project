
public class ProductPrice {
	private double price;
	
	public ProductPrice(double price) {
		this.setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price=" + price;
	}
	

}
