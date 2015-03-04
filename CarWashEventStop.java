package lab5;

public class CarWashEventStop extends Event {
	public CarWashEventStop(double p) {
		super(p);
	}
	
	/**
	 * Stop-eventet sätter statets stopvariabel till sann så exekveringen av
	 * simuleringen slutar vid nästa koll efter event.
	 * Sedan printar den ut slut info (se lab 5 PDF:en).
	 */
	public void execute(Simulator sim, SimState ss) {
		ss.stop = true;
	}
	
	public String toString() {
		return "";
	}
}
