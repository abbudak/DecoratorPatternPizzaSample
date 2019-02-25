package pizza;

public class Main {

	public static void main(String[] args) {
		Pizza veggy = new Veggy();
		System.out.println("Your Pizza's Name: "+ veggy.productName);
		System.out.println("Your Pizza's Price: "+ veggy.getPrice());
		
		
		Pizza glutenFree = new GlutenFree();
		System.out.println("Your Pizza's Name: " + glutenFree.productName);
		System.out.println("Your Pizza's Price: "+ glutenFree.getPrice());
		
		Pizza pizzaWithMaioneseAndKetchup = new ExtraMaionese(new ExtraKetchup(veggy));
		System.out.println("Your Pizza's Name: " + pizzaWithMaioneseAndKetchup.getProductName());
		System.out.println("Your Pizza's Name: " + pizzaWithMaioneseAndKetchup.getPrice());
		
		Pizza pizzaWithKetchup = new ExtraKetchup(glutenFree);
		System.out.println("Your Pizza's Name: " + pizzaWithKetchup.getProductName());
		System.out.println("Your Pizza's Name: " + pizzaWithKetchup.getPrice());
		
	}

}
