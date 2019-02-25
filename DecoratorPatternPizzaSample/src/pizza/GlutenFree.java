package pizza;

public class GlutenFree extends Pizza{
	
	public GlutenFree() {
		productName = "Gluten Free";
	}

	@Override
	public double getPrice() {
		return 6;
	}

}
