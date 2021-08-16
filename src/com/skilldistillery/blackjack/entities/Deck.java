package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	making this public because everyone knows which 52 cards
//	are in a deck. but also mabybe should be private or make
//	some of its methods private.
	private List<Card> deck = new ArrayList<>();
	Suit[] suits = Suit.values();
	Rank[] ranks = Rank.values();


	public Deck() {
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	public int checkDeckSize() {
		return this.deck.size();
	}
	
	public void printTopCard() {
		System.out.println(deck.get(0));
	}
	
	public Card dealCard() {
		Card card = this.deck.get(0);
		this.deck.remove(0);
		return card;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
