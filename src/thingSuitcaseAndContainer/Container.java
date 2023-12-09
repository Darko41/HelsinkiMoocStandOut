package thingSuitcaseAndContainer;

import java.util.ArrayList;

public class Container {
	
	private int maxWeight;
	private ArrayList<Suitcase> container;
	
	public Container(int maxWeight) {
		this.maxWeight = maxWeight;
		this.container = new ArrayList<>();
	}
	
	public void addSuitcase(Suitcase suitcase) {
		if (suitcase.totalWeight() + totalWeight() <= maxWeight) {
			container.add(suitcase);
		}
	}

	public int totalWeight() {
		int totalWeight = 0;
		for (Suitcase s : container) {
			totalWeight += s.totalWeight();
		}
		return totalWeight;
	}

	public void printThings() {
		for (Suitcase s : container) {
			s.printThings();
		}
	}

	@Override
	public String toString() {
		return container.size() + " suitcases" + " (" +
				totalWeight() + " kg)";
	}
	
}
