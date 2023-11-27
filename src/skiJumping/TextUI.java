package skiJumping;

import java.util.Scanner;

public class TextUI {
	
	private Scanner reader;
	private Tournament tournament;
	
	public TextUI(Scanner reader) {
		super();
		this.reader = reader;
	}
	
	public void start() {
		this.tournament = new Tournament();
		registerJumper();
		playTournament();
	}

	private void playTournament() {
		System.out.println("The tournament begins!\n");
		String s = "";
		
		while (true) {
			System.out.println("Write \"jump\" to jump; otherwise you quit: ");
			s = this.reader.nextLine();
			
			if (!s.equals("jump")) {
				System.out.println("\nThanks!\n");
				break;
			}
			System.out.println("");
			
			this.tournament.playRonud();
		}
		this.tournament.printTournamentResults();
		
	}

	private void registerJumper() {
		String s = "name";
		System.out.println("Kumpula ski jumping week\n");
		System.out.println("Write the names of the participants one at a time; " +
				"an empty string brings you to the jumping phase.");
		
		while (true) {
			System.out.println("  Participant name: ");
			s = this.reader.nextLine();
			if (s.isEmpty())
				break;
			this.tournament.addPLayer(new Jumper(s));
		}
		System.out.println("");
	}

}
