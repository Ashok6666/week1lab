package mixeddrink_order.mixeddrink;

public class Mojito extends Cocktail{

	public Mojito() {
		flavourDesc = "Mojito Cocktail";
	}

	@Override
	public double cost() {
		return 4.0;
	}
}
