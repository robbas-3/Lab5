package lab5;

public class CarWashEventStart extends Event {
	
	public CarWashEventStart(double p) {
		super(p);
	}
	
	/**
	 * I CarWashEventStarts execute metod generar det första arrive eventet
	 * samt printa ut de ursprungliga värdena
	 */
	public void execute(Simulator sim, SimState ss) {
		
	}
	
	public String toString() {
		return "";
	}
}
