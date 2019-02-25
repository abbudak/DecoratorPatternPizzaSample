package pizza;

public abstract class PizzaDecorator extends Pizza{
	protected Pizza pizza;
	
	 @Override
	 public abstract String getProductName();
}
