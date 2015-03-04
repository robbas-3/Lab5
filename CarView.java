package lab5;

import java.util.Observable;

public class CarView extends SimView {

	/** 
	 * 
	 */
	public void update(Observable o, Object arg) {
		System.out.println("Event " + (String) arg + " was executed!");
	}
}
