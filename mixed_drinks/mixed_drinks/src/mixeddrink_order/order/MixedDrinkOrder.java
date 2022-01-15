package mixeddrink_order.order;

import java.util.Observable;

import mixeddrink_order.mixeddrink.Cocktail;

@SuppressWarnings("deprecation")
public class MixedDrinkOrder extends Observable {

	public Cocktail cocktail;

	public void setCocktail(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public void orderScreen() {
		System.out.println("Ordering Cocktail for you");
		setChanged();
		notifyObservers(cocktail);
	}
}
