package skiJumping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jumper implements Comparable<Jumper> {
	
	private String name;
	private int points = 0;
	private List<Integer> jumpLengths = new ArrayList<>();
	private Random random = new Random();
	
	public Jumper(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoints() {
		return this.points;
	}

	public void jump() {
		ArrayList<Integer> scores = getScores();
		int length = randInt(60, 120);
		
		System.out.println("  " + this.getName());
		System.out.println("   length: " + length);
		System.out.println("   judge votes: " + scores);
		
		int roundPoints = length;
		Collections.sort(scores);
		for (int i = 1; i < 4; i++) {
			roundPoints += scores.get(i);
		}
		
		this.points += roundPoints;
		this.jumpLengths.add(length);
	}

	private ArrayList<Integer> getScores() {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			scores.add(randInt(10, 20));
		}
		return scores;
	}

	private Integer randInt(int min, int max) {
		int randNumber = this.random.nextInt((max - min) + 1) + min;
		return randNumber;
	}
	
	public String getJumperLengthsString() {
		String s = "";
		for (int jump : this.jumpLengths) {
			s += " " + jump + " m,";
		}
		return s.substring(0, s.length() - 1);
	}

	@Override
	public String toString() {
		return this.name + " (" + this.getPoints() + " points)";
	}
	
	@Override
	public int compareTo(Jumper jumper) {
		return this.getPoints() - jumper.getPoints();
	}
}
