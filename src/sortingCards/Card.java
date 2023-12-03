package sortingCards;

public class Card implements Comparable<Card>{
	
	public static final int SPADES = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;
	
	public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
	public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public int value;
	public int suit;

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return VALUES[value] + " of " + SUITS[suit];
	}

	@Override
	public int compareTo(Card o) {
		if (this.value - o.getValue() == 0) {
			return this.suit - o.getSuit();
		}
		return this.value - o.getValue();
	}
	
}
