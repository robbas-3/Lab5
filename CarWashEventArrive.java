package lab5;

public class CarWashEventArrive extends Event {
	
	public CarWashEventArrive(double p) {
		super(p);
	}
	
	/**
	 * Timevariabeln i statevariabeln ökas med detta eventets tid minus timevariabeln.
	 * 
	 * Finns det några lediga biltvättar måste även tidigare nämnd deltatid gångras med antal lediga tvättar,
	 * och plussas på i idleTime i statevariabeln.
	 * 
	 * Sedan läggs en bil till i den snabba eller långsamma biltvätten.
	 * Den snabba prioriteras över den långsamma. Finns ingen ledig plats läggs den till i kön.
	 * Lades en bil till i en tvätt, måste ett leave-event genereras med prioriteten som fås av
	 * ss.slowWashRand.next() om den ligger i en långsam biltvätt eller ss.fastWashRand.next() om
	 * den ligger i en snabb biltvätt.
	 * Är kön i sin tur full ska rejectedCars i statevariabeln ökas.
	 * 
	 * Sist skall ett nytt arrive genereras med prioriteten som fås av ss.arrivalRand() och funktionen avslutas.
	 */
	public void execute(Simulator sim, SimState ss) {
		if(ss.fastWash.length <= ss.fastWashMax){
			ss.fastWash.add(id);
			leave(ss.fastWashRand.next());
		}
		else if(ss.slowWash.length <= ss.slowWashMax){
			ss.slowWash.add(id);
			leave(ss.slowWashRand.next());
		}
		else if(ss.carQueue.length <= ss.carQueueMax){
			ss.carQueue.add(id);
		}
		else(){
			rejectedCars++;
		}

	}
	
	public String toString() {
		return "";
	}
}
