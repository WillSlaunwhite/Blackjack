package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<Card>();
	
	public Hand() { }
	
	public Hand(Deck deck) {	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		cards.removeAll(cards);
	}
	
	public abstract int getHandValue();
	
	@Override
	public String toString() {
		String cardString = "";
		for(Card card : cards) {
			cardString += (card.toString() + "   ");
			
		}
		return cardString;
	}
	
}
