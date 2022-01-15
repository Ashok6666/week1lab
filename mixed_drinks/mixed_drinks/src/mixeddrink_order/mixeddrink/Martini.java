package mixeddrink_order.mixeddrink;

public class Martini extends Cocktail{

	public Martini() {
		flavourDesc = "Martini cocktail";
	}

	@Override
	public double cost() {
		return 3.0;
	}

}
