package mixeddrink_order.mixeddrink;

public abstract class Cocktail {

	public String flavourDesc = "cocktail";
	
	public String getDescription() {
		return flavourDesc;
	}
	
	public abstract double cost();

}
