package mixeddrink_order.order;

import java.util.Observable;
import java.util.Observer;

import mixeddrink_order.mixeddrink.Cocktail;

@SuppressWarnings("deprecation")
public class StoreOrderConfirmation implements Observer {
	
	Observable observable;

	public StoreOrderConfirmation(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof MixedDrinkOrder) {
			Cocktail cocktail = (Cocktail) arg;
			
			System.out.println("Order Received: " + cocktail.getDescription() + " with Price: " + cocktail.cost());
			
			confirmOrder(cocktail);
		}
		
	}
	
	public void confirmOrder(Cocktail cocktail) {
		System.out.println("Order Confirmed. Will Proceed to nextSteps");
	}

}
