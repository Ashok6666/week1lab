package mixeddrink_order.mixeddrink;

public class FreshLime extends AddOnsDecorator {

	public FreshLime(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public String getDescription() {
		return cocktail.getDescription() + ", Fresh Lime";
	}

	public double cost() {
		return cocktail.cost() + 0.4;
	}
}
