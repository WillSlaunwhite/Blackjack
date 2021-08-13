package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//We will be simulating a deck of cards.
//
//Create a class Deck. It will hold a List of Cards.
//In the constructor, initialize the List with all 52 cards.
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.
//(Solution: Deck.java)

public class Deck {
	List<Card> deck = new ArrayList<>();
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

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
