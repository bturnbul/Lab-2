package pokerBase;


public class Hand {
	
	private ArrayList<Card> CurrentHand;
	private ArrayLst<Card> BestCards;    
	private HandScore HandScore;
	private boolean bScored = False;
	private boolean Flush;
	private boolean straight;
	private boolean Ace;
	
	public Hand() {
		CurrentHand = new ArrayList<Card>();
		BestCards = new ArrayList<Card>();
	
	}
	public ArrayList<Card> getCurrentHand() {
		return CurrentHand;

	}
	public HandScore get HandScore() {
		HandScore = handScore;
	}
	
	public Hand Draw(Deck d) {
		//CurrentHand.add(d.draw());
		return this;
	}
}

