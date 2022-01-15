package mixeddrink_order;

import mixeddrink_order.mixeddrink.CocktailOlives;
import mixeddrink_order.mixeddrink.Cocktail;
import mixeddrink_order.mixeddrink.BlueBerry;
import mixeddrink_order.mixeddrink.Margarita;
import mixeddrink_order.order.MixedDrinkOrder;
import mixeddrink_order.order.StoreOrderConfirmation;

public class OrderMixedDrink {

	public static void main(String[] args) {
		MixedDrinkOrder order = new MixedDrinkOrder();
		StoreOrderConfirmation orderPlacing = new StoreOrderConfirmation(order);
		Cocktail cocktail = new Margarita();
		System.out.println(cocktail.getDescription() + " => " + cocktail.cost() + "$");
		
		//Adding the Addons
		cocktail = new CocktailOlives(cocktail);
		cocktail = new BlueBerry(cocktail);
		
		System.out.println(cocktail.getDescription() + " " + cocktail.cost() + "$");
		
		order.setCocktail(cocktail);
		order.orderScreen();
		
	}
}
