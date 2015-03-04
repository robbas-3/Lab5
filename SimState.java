package lab5;

import java.util.Observable;

public class SimState extends Observable {
	protected boolean stop;
	
	public SimState() {
		stop = false;
	}
	
	public boolean hasStopped() {
		return stop;
	}
}
