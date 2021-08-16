package com.skilldistillery.blackjack.app;
import com.skilldistillery.blackjack.entities.*;

public class BlackjackHand extends Hand {
	
	public BlackjackHand() { }
	
	public void dealBlackjackHand(Deck deck) {
		// this either will go here or in dealer class
		for(int i=0; i<2; i++) {
			addCard(deck.dealCard());
		}
		
	}
	
	@Override
	public int getHandValue(){
		int value=0;
		for(Card card : cards) {
			value += card.getValue(card);
		}
		return value;
	}
	
	public boolean isBlackjack() {
		if(getHandValue() == 21) {
			return true;
		} else { return false; }
		
	}
	
	public boolean isBust() {
		if(getHandValue() > 21) {
			return true;
		} else { return false; }
	}

}
