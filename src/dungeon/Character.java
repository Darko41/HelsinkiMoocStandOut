package dungeon;

import java.util.ArrayList;

public abstract class Character {
	
	String name;
	int length;
	int height;
	int x;
	int y;
	
	public Character(String name, int length, int height) {
		super();
		this.name = name;
		this.length = length;
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void move(ArrayList<String> moves) {
		
	}
	
	public void move(int moves, boolean vampireMoves) {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		Character compared = (Character) obj;
		
		if (this.x == compared.x && this.y == compared.y)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return this.name + " " + this.x + " " + this.y;
	}
	
	
}