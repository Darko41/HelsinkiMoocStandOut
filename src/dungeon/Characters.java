package dungeon;

import java.util.ArrayList;

public class Characters {
	
	private ArrayList<Character> list;
	
	public Characters(int length, int height, int vampires) {
		list = new ArrayList<Character>();
		
		Player player = new Player("@", length, height);
		list.add(player);
		
		while (list.size() <= vampires) {
			Vampire v = new Vampire("v", length, height);
			if (!list.contains(v)) {
				list.add(v);
			}
		}
	}
	
	public void printCharacters() {
		for (Character c : list) {
			System.out.println(c);
		}
	}
	
	public ArrayList<Character> returnCharacters() {
		return list;
	}
	
	public void moveAndRemoveCharacters(ArrayList<String> moves, boolean vampireMoves) {
		ArrayList<Character> vampiresMoved = new ArrayList<>();
		Character player = new Player("", 0, 0);
		for (Character c : list) {
			if (c.getName().equals("@")) {
				c.move(moves);
				player = c;
			}
			else {
				c.move(moves.size(), vampireMoves);
				if (!vampiresMoved.contains(c)) {
					vampiresMoved.add(c);
				}
			}
			
		}
		ArrayList<Character> toBeRemoved = new ArrayList<>();
		for (Character c : vampiresMoved) {
			if (c.equals(player)) {
				toBeRemoved.add(c);
			}
		}
		vampiresMoved.removeAll(toBeRemoved);
		list.clear();
		list.add(player);
		list.addAll(vampiresMoved);
	}

}
