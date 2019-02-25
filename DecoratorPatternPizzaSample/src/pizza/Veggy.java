package pizza;

public class Veggy extends Pizza {
	public Veggy() {
		productName = "VeggyPizza";
	}

	@Override
	public double getPrice() {
		return 5;
	}

}
