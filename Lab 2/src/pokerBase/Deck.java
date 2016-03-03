package poker;

import java.util.ArrayList;

public class Deck {
	
	public static ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){
		for(int suit = 1; suit <= 4; suit++){
			for(int val = 1; val <= 13; val++){
				Card c = new Card(val, suit);
				deck.add(c);
			}
		}
	}
}

