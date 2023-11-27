package skiJumping;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
	
	private ArrayList<Jumper> jumpers = new ArrayList<Jumper>();
	private int roundNumber = 1;
	
	public void addPLayer(Jumper p) {
		this.jumpers.add(p);
	}

	public void playRonud() {
		int c = 1;
		
		System.out.println("Round " + this.roundNumber + "\n");
		System.out.println("Jumping started:");
		
		Collections.sort(this.jumpers);
		
		for (Jumper j : this.jumpers) {
			System.out.println("  " + c + ". " + j);
			c++;
		}
		System.out.println("\nResults of round " + this.roundNumber);
		
		for (Jumper j : this.jumpers) {
			j.jump();
		}
		System.out.println("");
		this.roundNumber++;
	}
	
	public void printTournamentResults() {
		Collections.sort(this.jumpers);
		Collections.reverse(this.jumpers);
		
		int i = 0;
		System.out.println("Tournament results:");
		System.out.println("Position    Name");
		
		for (Jumper j : this.jumpers) {
			System.out.println((i + 1) + "           " + this.jumpers.get(i));
			System.out.println("            jump lengths:" + j.getJumperLengthsString());
			i++;
		}
	}
}
