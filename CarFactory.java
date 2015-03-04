package lab5;

public class CarFactory {
	private int counter;
	
	public CarFactory() {
		counter = 0;
	}
	
	public int nextId () {
		return counter++;
	}
}
