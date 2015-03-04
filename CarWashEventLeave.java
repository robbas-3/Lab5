package lab5;

public class CarWashEventLeave extends Event {
	
	private int id;
	
	public CarWashEventLeave(double p, int id) {
		super(p);
		this.id = id;
	}
	
	/**
	 * I leave-eventets executemetod skall först öka på timevariabeln i statet
	 * med delta-tiden (detta events prioritet minus statets tid) och sedan idleTime 
	 * i statet om det finns några lediga biltvättar
	 * och sedan idleTime i statet om några lediga tvättar finns.
	 * 
	 * Efter det söker man igenom långsamma och snabba biltvättar efter id:t som skall tas bort
	 * och gör det om id:t finns.
	 * 
	 * Om ett id togs bort skall det första id:t i statets kö (om det finns bilar i kön) läggas till
	 * i en biltvätt, med högre prioritet på en snabb tvätt. Sedan genereras ett till leave-event för det id:t
	 * 
	 * Sedan avslutas funktionen.
	 */
	public void execute(Simulator sim, SimState ss) {
		
	}
	
	public String toString() {
		return "";
	}
}
