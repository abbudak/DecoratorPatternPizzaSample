package pizza;

public abstract class Pizza {
	
	String productName= "";
	
	public String getProductName() {
		return productName;
	}
	
	public abstract double getPrice();

}
