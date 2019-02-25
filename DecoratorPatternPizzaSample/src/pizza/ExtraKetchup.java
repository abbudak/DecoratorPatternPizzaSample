package pizza;

public class ExtraKetchup extends PizzaDecorator{
	public ExtraKetchup(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getProductName() {
		return pizza.getProductName() + " with extra ketchup";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.20;
	}

}
