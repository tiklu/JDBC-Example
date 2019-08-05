/**
 * 
 */
package weekendassignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 *
 */
class Card{
	String symbol;
	int number;
	Card(String symbol, int number){
		this.symbol = symbol;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object other){
		Card otherCard = (Card) other;
		if((this.symbol).equals(otherCard.symbol)) return true;;
		return false;
	}
	
	@Override
	public int hashCode(){
		int hash = 5;
		hash = hash*24 + this.symbol.charAt(0);
		return hash;
	}
}
public class ProblemTwentyNine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Card> set = new HashSet<Card>();
		while(set.size() < 4){
			String symbol = sc.next();
			int number = sc.nextInt();
			Card cd = new Card(symbol, number);
			set.add(cd);
		}
		
		for(Card c: set){
			System.out.println(c.symbol + " " + c.number);
		}
	}

}
