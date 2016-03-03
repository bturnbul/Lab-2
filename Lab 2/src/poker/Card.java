import pokerEnums.eRank;
import pokerEnums.eSuit;

package pokerBase;

public class Card implements Comparable {
	private eSuit eSuit;
	private eRank eRank;
	private int iCardNbr;
	
	public Card(pokerEnums.eSuit eSuit, pokerEnums.eRank eRank, int iCardNbr) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
		this.iCardNbr = iCardNbr;
	}

	public eSuit geteSuit(){
		return eSuit;
	}
	
	public eRank geteRank(){
		return eRank;
	}
	
	public int getiCardNbr(){
		return iCardNbr;
	}
	
	public static Comparator<Card> CardRank= new comp
			
			public int compare(Card c1, Card c2){
				
				int Cno1 = c1.getRank().getRank();
				int Cno2 = c2.getRank().getRank();
				
				/*For descending order**/
				return Cno2 - Cno1;
				
			}}}
			
	public int compareTo(Object o){
		Card c = (Card) o;
		return c.geteRank().comapreTo(this.geteRank);
	}

}

