package dungeon;

import java.util.ArrayList;

public class GameGrid {
	
	private Characters characters;
	private ArrayList<String> gameGrid;
	private int length;
	private int height;
	private boolean vampireMove;
	
	public GameGrid(int length, int height, int vampires, boolean vampireMove) {
		super();
		characters = new Characters(length, height, vampires);
		this.gameGrid = new ArrayList<>();
		this.length = length;
		this.height = height;
		this.vampireMove = vampireMove;
	}
	
	public void createGrid() {
		gameGrid.clear();
		
		ArrayList<Character> players = characters.returnCharacters();
		for (int y = 0; y < length; y++) {
			ArrayList<Character> playersOnY = new ArrayList<>();
			for (Character c : players) {
				if (c.getY() == y) {
					playersOnY.add(c);
				}
			}
			String s = "";
			for (int x = 0; x < length; x++) {
				boolean containsPlayer = false;
				for (Character c : playersOnY) {
					if (x == c.getX()) {
						s += c.getName();
						containsPlayer = true;
					}
				}
				if (containsPlayer == false) {
					s += ".";
				}
			}
			gameGrid.add(s);
		}
	}
	
	public ArrayList<Character> returnCharacters() {
		return characters.returnCharacters();
	}
	
	public void printGameGrid() {
		System.out.println();
		this.characters.printCharacters();
		System.out.println();
		this.createGrid();
		for (String s: this.gameGrid) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	public void moveAndRemoveCharacters(ArrayList<String> moves) {
		characters.moveAndRemoveCharacters(moves, vampireMove);
	}

}
