package mixeddrink_order.mixeddrink;

public class CocktailOlives extends AddOnsDecorator{

	public CocktailOlives(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public String getDescription() {
		return cocktail.getDescription() + ", Cocktail olives";
	}

	public double cost() {
		return cocktail.cost() + 0.3;
	}

}
