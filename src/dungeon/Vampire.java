package dungeon;

import java.util.Random;

public class Vampire extends Character {
	Random random;

	public Vampire(String name, int length, int height) {
		super(name, length, height);
		random = new Random();
		this.x = random.nextInt(length);
		this.y = random.nextInt(height);
	}

	@Override
	public void move(int moves, boolean vampireMoves) {
		if (vampireMoves == true) {
			for (int i = 0; i < moves; i++) {
				int rand = random.nextInt(4);
				if (rand == 0 && x+1 < length && x+1 >= 0) {
					x += 1;
				}
				else if (rand == 1 && x-1 < length && x-1 >= 0) {
					x -= 1;
				}
				else if (rand == 2 && y+1 < height && y+1 >= 0) {
					y += 1;
				}
				else if (rand == 3 && y-1 < height && y-1 >= 0) {
					y -= 1;
				}
			}
		}
	}

	
	
}
