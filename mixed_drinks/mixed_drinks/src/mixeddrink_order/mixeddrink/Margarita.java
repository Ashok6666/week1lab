package mixeddrink_order.mixeddrink;

public class Margarita extends Cocktail {
	
	public Margarita() {
		flavourDesc = "Margarita Cocktail";
	}

	@Override
	public double cost() {
		return 2.0;
	}

}
