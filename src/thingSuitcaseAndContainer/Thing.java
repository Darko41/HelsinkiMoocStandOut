package thingSuitcaseAndContainer;

public class Thing {
	
	private String name;
	private int weight;
	
	public Thing(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return name + " (" + weight + " kg)";
	}
	
	

}
