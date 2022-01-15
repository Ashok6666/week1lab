package mixeddrink_order.mixeddrink;

public class BlueBerry extends AddOnsDecorator {

	public BlueBerry(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public String getDescription() {
		return cocktail.getDescription() + ", BlueBerry";
	}
	
	public double cost() {
		return cocktail.cost() + 0.2;
	}
}
