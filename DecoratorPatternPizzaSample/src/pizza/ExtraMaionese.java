package pizza;

public class ExtraMaionese  extends PizzaDecorator{
	
	public ExtraMaionese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getProductName() {
		return pizza.getProductName() + " with extra maionese";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.25;
	}

}
