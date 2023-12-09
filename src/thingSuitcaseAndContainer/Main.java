package thingSuitcaseAndContainer;

public class Main {
	
	public static void main(String[] args) {
		Container container = new Container(1000);
		addSuitcaseFullOfBrics(container);
		System.out.println(container);
	}
	
	public static void addSuitcaseFullOfBrics(Container container) {
		for (int i = 0; i < 100; i++) {
			Thing brick = new Thing("brick", i + 1);
			Suitcase s = new Suitcase(101);
			s.addThing(brick);
			container.addSuitcase(s);
		}
	}

}
