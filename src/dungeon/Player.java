package dungeon;

import java.util.ArrayList;

public class Player extends Character {

	public Player(String name, int length, int height) {
		super(name, length, height);
		this.x = 0;
		this.y = 0;
	}

	@Override
	public void move(ArrayList<String> moves) {
		for (String s : moves) {
			if (s.equals("w") && y-1 < height && y-1 >= 0) {
				y -= 1;
			}
			else if (s.equals("s") && y+1 < height && y+1 >= 0) {
				y += 1;
			}
			else if (s.equals("a") && x-1 < length && x-1 >= 0) {
				x -= 1;
			}
			else if (s.equals("d") && x+1 < length && x+1 >= 0) {
				x -= 1;
			}
		}
	}
	
	

}
