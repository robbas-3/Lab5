package lab5;

import java.util.ArrayList;

public class SortedSequence {
	private ArrayList<Event> ss;
	
	public SortedSequence() {
		ss = new ArrayList<Event>();
	}
	
	public void addEvent(Event e) {
		for(int i = 0; i < ss.size(); i++) {
			if(ss.get(i).getPriority() > e.getPriority()) {
				ss.add(i-1, e);
				return; 
			}
		}
		
		ss.add(e);
	}
	
	public Event getNext() {
		if(ss.size() == 0) {
			return null;
		}
		
		Event e = ss.get(0);
		ss.remove(0);
		return e;
	}
	
	public int length() {
		return ss.size();
	}
}
