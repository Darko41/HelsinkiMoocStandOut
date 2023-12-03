package thingSuitcaseAndContainer;

import java.util.ArrayList;

public class Suitcase {
	
	private ArrayList<Thing> things;
	private int maxWeight;
	
	public Suitcase(int maxWeight) {
		super();
		this.maxWeight = maxWeight;
		this.things = new ArrayList<>();
	}
	
	public void addThing(Thing thing) {
		if (thing.getWeight() + totalWeight() <= maxWeight) {
			things.add(thing);
		}
	}

	private int totalWeight() {
		int totalWeight = 0;
		for (Thing t : things) {
			totalWeight += t.getWeight();
		}
		return totalWeight;
	}

	@Override
	public String toString() {
		String text = "";
		if (things.isEmpty()) {
			text += "empty";
		}
		else if (things.size() == 1) {
			text += "1 thing";
		}
		else if (things.size() > 1) {
			text += things.size() + " things";
		}
		return text + " (" + totalWeight() + " kg");
	}
	
	public void printThings() {
		for (Thing t : things) {
			System.out.println(t);
		}
	}
	
	public Thing heaviestThing() {
		if (things.isEmpty()) {
			return null;
		}
		Thing heaviest = things.get(0);
		for (Thing t : things) {
			if (t.getWeight() > heaviest.getWeight()) {
				heaviest = t;
			}
		}
		return heaviest;
	}

}
