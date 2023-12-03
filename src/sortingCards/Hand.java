package sortingCards;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
	
	private ArrayList<Card> hand;

	public Hand() {
		this.hand = new ArrayList<Card>();
	}
	
	public void add(Card card) {
		this.hand.add(card);
	}
	
	public void print() {
		for (Card c : this.hand) {
			System.out.println(c);
		}
	}
	
	public void sort() {
		Collections.sort(hand);
	}
	
	public int getHandValue() {
		int value = 0;
		for (Card c : this.hand) {
			value += c.getValue();
		}
		return value;
	}
	
	public void sortAgainstSuit() {
		Collections.sort(this.hand, new SortAgainstSuitValue());
	}

	@Override
	public int compareTo(Hand o) {
		return this.getHandValue() - o.getHandValue();
	}
	
	

}
